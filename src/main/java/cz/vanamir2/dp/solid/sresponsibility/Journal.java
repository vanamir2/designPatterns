package cz.vanamir2.dp.solid.sresponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private static int count = 0;
    private final List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // ----- THIS IS WRONG - class journal should handle work with Journal entries, but no with persistence.
    // Persistence is a different concern ant it should be separated. Do not put different concerns together.
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    public void load(String filename) {
    }

    public void load(URL url) {
    }

}

