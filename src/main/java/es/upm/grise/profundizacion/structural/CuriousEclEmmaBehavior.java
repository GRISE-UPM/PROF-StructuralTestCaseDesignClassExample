package es.upm.grise.profundizacion.structural;

public class CuriousEclEmmaBehavior {
	
	// See https://sourceforge.net/p/eclemma/discussion/614869/thread/142a1e48/
	public void logicalAnd(boolean a, boolean b) {
		if (a  && b) {
			;
		}
	}
	
	public void foo() throws Exception {
		throw new Exception();
	}
	

}
