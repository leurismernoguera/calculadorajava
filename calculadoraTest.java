package calculadorajava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public void setUp() 
new Calculadorajava();

void testmultiplicar() {
	double unNumeroM = 80;
	double otroNumeroM = 3;
	assertTrue(Calculadorajava.multiplicar(unNumeroM, otroNumeroM) == 240.0);
}

void testdividir() {
	double unNumeroD = 150;
	double otroNumeroD = 180;
	assertTrue(Calculadorajava.dividir(unNumeroD, otroNumeroD) / 3 == 110.0);
}

void testrestar() {
	double unNumeroR = 90;
	double otroNumeroR = 50;
	assertTrue(Calculadorajava.dividir(unNumeroR, otroNumeroR) * 15 == 600.0);
}

void testsumar() {
	double unNumero = 70;
	double otroNumero = 40;
	assertTrue(Calculadorajava.sumar(unNumero, otroNumero) * 25 == 2750.0);
}
}