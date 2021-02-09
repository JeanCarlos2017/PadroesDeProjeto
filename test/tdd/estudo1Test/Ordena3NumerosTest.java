package tdd.estudo1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.estudo1.Ordena3Numeros;

class Ordena3NumerosTest {
	
	@Test
	public void ordenaNumerosCrescentes() {
		Ordena3Numeros ordena = new Ordena3Numeros(1, 2, 3);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(3, ordena.getC());
	}
	@Test
	public void ordenaNumerosAmaiorQueB() {
		Ordena3Numeros ordena = new Ordena3Numeros(2,1,3);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(3, ordena.getC());
	}
	@Test
	public void ordenaNumerosBmaiorQueC() {
		Ordena3Numeros ordena = new Ordena3Numeros(1,3,2);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(3, ordena.getC());
	}
	@Test
	public void ordenaNumerosDecresrescentes() {
		Ordena3Numeros ordena = new Ordena3Numeros(3,2,1);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(3, ordena.getC());
	}
	@Test
	public void ordenaNumerosAigualB() {
		Ordena3Numeros ordena = new Ordena3Numeros(2,2,1);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(2, ordena.getC());
	}
	@Test
	public void ordenaNumerosBigualC() {
		Ordena3Numeros ordena = new Ordena3Numeros(1,2,2);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(2, ordena.getC());
	}
	@Test
	public void ordenaNumerosAigualC() {
		Ordena3Numeros ordena = new Ordena3Numeros(2,1,2);
		ordena.ordena();
		assertEquals(1, ordena.getA());
		assertEquals(2, ordena.getB());
		assertEquals(2, ordena.getC());
	}


}
