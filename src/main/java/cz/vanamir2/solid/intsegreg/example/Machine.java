package cz.vanamir2.solid.intsegreg.example;

// This is NOT segregated (and harder to work with) Interface
public interface Machine {
    void print(Document document);

    void fax(Document document);

    void scan(Document document);
}
