package cz.vanamir2.dp.creational.builder.exercise;

import java.util.HashMap;
import java.util.Map;

class CodeBuilder {

    private final String className;
    private final Map<String, String> nameToType = new HashMap<>();

    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        nameToType.put(name, type);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("public class ").append(className).append("\n")
                .append("{").append("\n");
        nameToType.forEach((name, type) -> sb
                .append("  public ")
                .append(type).append(" ").append(name).append(";").append("\n"));
        sb.append("}");
        return sb.toString();
    }
}
