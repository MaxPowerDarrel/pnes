package io.darrel.pnes.decode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDecoder {
    public static Ines decodeFile(String file) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Path.of("/Users/darrel/Downloads/Contra (U).nes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Ines(bytes);
    }
}
