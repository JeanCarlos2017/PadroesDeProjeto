package tdd.estudo1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.estudo1.ConversaoRomana;

class ConversaoRomanaTest {

	@Test
	public void deveEntenderOSimboloI() {
		ConversaoRomana romano = new ConversaoRomana();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV() {
		ConversaoRomana romano = new ConversaoRomana();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
}
