package cz.vanamir2.dp.creational.builder.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeBuilderTest {


    @Test
    void testExample() {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        String output = """
                public class Person
                {
                  public String name;
                  public int age;
                }""";
        assertEquals(output, cb.toString());
    }

}
