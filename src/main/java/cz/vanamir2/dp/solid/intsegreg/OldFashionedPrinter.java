package cz.vanamir2.dp.solid.intsegreg;

// OldFashionedPrinter does not know how to scan or fax
// if we leave methods empty, user can be confused why it is not doing anything
// if we throw exception "Not implemented", it have to propagate to Interace (and we mostly do not control those interfaces)
// here comes Interface Segregation principle
public class OldFashionedPrinter implements Machine {

    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
