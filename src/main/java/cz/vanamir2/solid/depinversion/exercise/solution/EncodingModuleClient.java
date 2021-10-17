package cz.vanamir2.solid.depinversion.exercise.solution;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();
        // encodingModule.encodeWithFiles();
        String encodedString = encodingModule.encodeBasedOnNetworkAndDatabase();
        Storage databaseStorage = new MyDatabase();
        databaseStorage.write(encodedString);
        System.out.println(encodedString);
    }
}
