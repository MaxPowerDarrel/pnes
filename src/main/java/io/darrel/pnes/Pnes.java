package io.darrel.pnes;

import io.darrel.pnes.decode.FileDecoder;
import io.darrel.pnes.decode.Ines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.darrel.pnes.util.Utilities.toBinaryString;
import static io.darrel.pnes.util.Utilities.toHexString;

public class Pnes {
    public static void main(String[] arguments) throws IOException {
        var ines = FileDecoder.decodeFile("/Users/darrel/Downloads/Contra (U).nes");
        StringBuilder result = new StringBuilder();
//        for (byte value : ines.getHeader()) {
//            var hex = toHexString(value);
//            var binary = toBinaryString(value);
//            result.append(hex)
//                    .append(" ")
//                    .append(binary)
//                    .append("\n");
//        }
        System.out.println(result);
    }
}
