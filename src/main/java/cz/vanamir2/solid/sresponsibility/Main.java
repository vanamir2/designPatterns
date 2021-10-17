package cz.vanamir2.solid.sresponsibility;

public class Main {

    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);
        Persitence persitence = new Persitence();
        String filename = "c:\\temp\\journal.txt";
        System.out.println(filename);
        persitence.saveToFile(journal, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);

        // WRONG WAY:
        journal.save(filename);
    }
}
