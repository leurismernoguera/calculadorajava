package calculadorajava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadorajavaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	void testmultiplicar() {
		double unNumeroM = 80;
		double otroNumeroM = 3;
		assertTrue(calculadorajava.multiplicar(unNumeroM, otroNumeroM) == 240.0);
	}

	void testdividir() {
		double unNumeroD = 150;
		double otroNumeroD = 180;
		assertTrue(calculadorajava.dividir(unNumeroD, otroNumeroD) / 3 == 110.0);
	}

	void testrestar() {
		double unNumeroR = 90;
		double otroNumeroR = 50;
		assertTrue(calculadorajava.dividir(unNumeroR, otroNumeroR) * 15 == 600.0);
	}

	void testsumar() {
		double unNumero = 70;
		double otroNumero = 40;
		assertTrue(calculadorajava.sumar(unNumero, otroNumero) * 25 == 2750.0);
	}
}
