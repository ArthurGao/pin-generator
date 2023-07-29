package org;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *  Library to generate unique 4 digit PINs.
 */
public class PinGenerator {

    /**
     * Constant for the number of PINs to generate.
     */
    private static final int PIN_COUNT = 1000;

    /**
     * Constant for the length of each PIN.
     */
    private static final int PIN_LENGTH = 4;
    private static final Random random = new Random();

    public Set<String> generatePins() {
        Set<String> pins = new HashSet<>();

        while (pins.size() < PIN_COUNT) {
            StringBuilder pin = new StringBuilder();

            for (int i = 0; i < PIN_LENGTH; i++) {
                pin.append(random.nextInt(10));
            }

            pins.add(pin.toString());
        }

        return pins;
    }
}
