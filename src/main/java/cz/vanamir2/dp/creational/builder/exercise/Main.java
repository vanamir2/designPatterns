package cz.vanamir2.dp.creational.builder.exercise;

public class Main {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb.toString());
    }
}
