package es.upm.grise.profundizacion.structural;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import es.upm.grise.profundizacion.structural.ClassExample;

public class ClassExample_extraExampleTest {

	@Test
	public void test1() {
		ClassExample ejemplo = new ClassExample();
		assertEquals(1, ejemplo.extraExample1(0, 1));
	}

	@Test
	public void test2() {
		ClassExample ejemplo = new ClassExample();
		assertEquals(0, ejemplo.extraExample1(1, 0));
	}
	
	@Test
	public void test3() {
		ClassExample ejemplo = new ClassExample();
		assertEquals(11, ejemplo.extraExample1(11, 1));
	}
	
	@Test
	public void test4() {
		ClassExample ejemplo = new ClassExample();
		assertEquals(12, ejemplo.extraExample1(10, 1));
	}

}
