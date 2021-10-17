package cz.vanamir2.solid.depinversion.exercise.template;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();
        //encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
