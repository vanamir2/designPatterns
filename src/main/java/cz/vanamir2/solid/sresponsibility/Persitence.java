package cz.vanamir2.solid.sresponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persitence {

    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

}
