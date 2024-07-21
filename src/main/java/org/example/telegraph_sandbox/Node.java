package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.telegraph_sandbox.jsonutils.NodeDeserializer;

@JsonDeserialize(using= NodeDeserializer.class)
public class Node {
}
