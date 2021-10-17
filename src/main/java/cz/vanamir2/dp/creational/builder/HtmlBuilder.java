package cz.vanamir2.dp.creational.builder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    // fluent variant
    public HtmlBuilder addChild(String name, String childText) {
        HtmlElement childElement = new HtmlElement(name, childText);
        root.elements.add(childElement);
        return this;
    }

    // not fluent variant
    /* public void addChild(String name, String childText){
        HtmlElement childElement = new HtmlElement(name, childText);
        root.elements.add(childElement);
    }
    */

    public void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }


}
