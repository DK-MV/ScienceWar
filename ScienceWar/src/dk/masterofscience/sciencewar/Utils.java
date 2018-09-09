package dk.masterofscience.sciencewar;

import java.security.SecureRandom;

public class Utils {
    private static final SecureRandom random = new SecureRandom();

    public static <T extends Enum<?>> T randomEnum(final Class<T> clazz) {
	final int x = random.nextInt(clazz.getEnumConstants().length);
	return clazz.getEnumConstants()[x];
    }
}
