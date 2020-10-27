package es.upm.grise.profundizacion.structural;

import org.junit.Ignore;
import org.junit.Test;

import es.upm.grise.profundizacion.structural.CuriousEclEmmaBehavior;

public class CuriousEclEmmaBehaviorTest {
	
	CuriousEclEmmaBehavior p = new CuriousEclEmmaBehavior();

	@Ignore
	@Test
	public void testAnd_ff() {
		p.logicalAnd(false, false);
	}
	
	@Test
	public void testAnd_ft() {
		p.logicalAnd(false, true);
	}
	
	@Test
	public void testAnd_tf() {
		p.logicalAnd(true, false);
	}
	
	@Test
	public void testAnd_tt() {
		p.logicalAnd(true, true);
	}
	
	@Test(expected=Exception.class)
	public void testException() throws Exception {
		p.foo();
	}
	

}
