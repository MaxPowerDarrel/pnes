package io.darrel.pnes.decode;

import java.util.Arrays;

import static io.darrel.pnes.util.Utilities.toBinaryString;

public class Ines {
    private final byte[] nesString;
    private final byte numberOfROMBanks;
    private final byte numberOfVROMBanks;
    private final String byte6Flags;
    private final String byte7Flags;
    private final byte numberOfRAMBanks;
    private final byte[] trailingHeaderBytes;
    private final byte[] data;

    private static final byte[] nesByteArray = new byte[]{78, 69, 83, 26};
    private static final byte[] zeroByteArray = new byte[]{0, 0, 0, 0, 0, 0};

    public Ines(byte[] data) {
        this.nesString = Arrays.copyOfRange(data, 0, 4);
        this.numberOfROMBanks = data[4];
        this.numberOfVROMBanks = data[5];
        this.byte6Flags = toBinaryString(data[6]);
        this.byte7Flags = toBinaryString(data[7]);
        this.numberOfRAMBanks = data[8];
        this.trailingHeaderBytes = Arrays.copyOfRange(data, 10, 16);
        this.data = Arrays.copyOfRange(data, 16, data.length);
    }

    public boolean validate() {
        return Arrays.equals(nesString, nesByteArray) && Arrays.equals(trailingHeaderBytes, zeroByteArray);
    }

    @Override
    public String toString() {
        return String.format("""
                        {"nesString":"%s", "numberOfROMBanks": %s, "numberOfVROMBanks": %s, "byte6Flags": %s, "byte7Flags": %s, "numberOfRAMBanks": %s}""",
                Arrays.toString(nesString), numberOfROMBanks, numberOfVROMBanks, byte6Flags, byte7Flags, numberOfRAMBanks);
    }
}
