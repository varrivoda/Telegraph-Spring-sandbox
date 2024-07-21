## Telegraph-sandbox
#### This is a sandbox for [my fork](https://github.com/varrivoda/Telegraph-fork) of [Telegraph](https://github.com/rubenlagus/Telegraph) app, which I wanted to migrate from Guice to Spring
...but didn't succeed on the first attempt due to it's illogical complexity :( 

So I did this sandbox. And you know what? This seems to work without any DI container :)

#### Это сэндбокс моего форка приложения Telegraph, которое я хотел переехать с Джюса на Спринг
... но с первого раза это не вышло, изза странной необычной архитектуры исходного приложения. "В лоб" поменять @Inject'ы на @Autowired не вышло, а постоянные попытки автора инжектить контекст и доставать из него синглетоны руками (особенно в абстрактном классе) меня добили. 

Но задачка всё же интересная, поэтому написал этот сэндбокc

#### Часть 1, прикручиваем Спринг-контекст. 
Конфиг с ObjectMapper'ом и @ComponentScan, на все бины @Component, инжекшены пусть пока будут field. Работает! 

#### Часть 2, Node и NodeElement 
Прежде чем писать остальные классы, надо реализовать ноды. чтобы приятнее было тестировать, а не писать jsonы для всех объектов вручную %)
Чтобы тестировать Node надо написать поддержку Page и CreatePage (классов становится многовато, заведем папки methods и objects)

от сервевра ответ на createPage приходит в таком формате:
```
{"ok":true,"result":{"path":"My-title-07-21-4","url":"https:\/\/telegra.ph\/My-title-07-21-4","title":"My title","description":"","author_name":"Random author","content":["My content"],"views":0,"can_edit":true}}
```
Пока что для простоты мы не подерживаем статус результата, поэтому в мок-ответ в Executor'e запишем просто содержимое result. 
Все раюобтает, единственнное что надо поменять названия JsonProperty, т.к. с сервера приходят _ вместо кэмелКейса