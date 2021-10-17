package cz.vanamir2.dp.creational.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {

    private final int INDENT_SIZE = 2;
    private final String NEW_LINE = System.lineSeparator();
    public String name;
    public String text;
    public ArrayList<HtmlElement> elements = new ArrayList<>();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }


    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * INDENT_SIZE, " "));
        sb.append(String.format("%s<%s>%s", i, name, NEW_LINE));
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(INDENT_SIZE * (indent + 1), " ")))
                    .append(text)
                    .append(NEW_LINE);
        }

        for (HtmlElement e : elements)
            sb.append(e.toStringImpl(indent + 1));

        sb.append(String.format("%s</%s>%s", i, name, NEW_LINE));
        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
