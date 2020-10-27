package es.upm.grise.profundizacion.structural;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import es.upm.grise.profundizacion.structural.ClassExample;
import es.upm.grise.profundizacion.structural.Utils;

@RunWith(Parameterized.class)
public class ClassExample_exampleInTheSlidesTest {
	
	private ClassExample programToTest;
	
	public ClassExample_exampleInTheSlidesTest (char [] keystrokes) {
		Utils.initialize(keystrokes);
	}
	
	@Parameters
	public static Collection<char[]> keystrokes() {
		return Arrays.asList(
				new char[][] {	
					{65, 27}, // Para salir del do..while. De lo contrario, el test no termina
							  // En la práctica, son 2 casos de prueba
					{13},
					{255, 27}
				});
	}

	@Before
	public void setup() {
		programToTest = new ClassExample();
	}

	@Test
	public void test() {
		programToTest.exampleInTheSlides();
	}

}
