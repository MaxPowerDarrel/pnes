package io.darrel.pnes.util;

public class Utilities {
    public static String toHexString(byte value) {
        int decimal = (int) value & 0xff;
        return Integer.toHexString(decimal);
    }

    public static String toBinaryString(byte value) {
        var decimal = value & 0xff;
        return String.format("%8s", Integer.toBinaryString(decimal)).replace(' ', '0');
    }
}
