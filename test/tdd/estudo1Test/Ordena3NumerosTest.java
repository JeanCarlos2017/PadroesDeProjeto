package tdd.estudo1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.estudo1.Ordena3Numeros;

class Ordena3NumerosTest {
	
	@Test
	public void ordenaNumerosCrescentes() {
		Ordena3Numeros ordena = new Ordena3Numeros(1, 2, 3);
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(3, ordena.getC());
	}

}
