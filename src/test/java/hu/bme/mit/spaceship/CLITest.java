package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class CLITest {

	@Test
	void optionalOutputTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalArgumentException {
		Class<?> optionalOutputClass = Class.forName("hu.bme.mit.spaceship.CommandLineInterface$OptionalOutput");
		Constructor<?> ctor = optionalOutputClass.getDeclaredConstructor(OutputStream.class);

		assertNotNull(ctor);
	}

}
