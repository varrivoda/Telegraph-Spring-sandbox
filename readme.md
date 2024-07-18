## Telegraph-sandbox
#### This is a sandbox for [my fork](https://github.com/varrivoda/Telegraph-fork) of [Telegraph](https://github.com/rubenlagus/Telegraph) app, which I wanted to migrate from Guice to Spring
...but didn't succeed on the first attempt due to it's illogical complexity :( 

So I did this sandbox. And you know what? This seems to work without any DI container :)

#### Это сэндбокс моего форка приложения Telegraph, которое я хотел переехать с Джюса на Спринг
... но с первого раза это не вышло, изза странной необычной архитектуры исходного приложения. "В лоб" поменять @Inject'ы на @Autowired не вышло, а постоянные попытки автора инжектить контекст и доставать из него синглетоны руками (особенно в абстрактном классе) меня добили. 

Но задачка всё же интересная, поэтому написал этот сэндбокс