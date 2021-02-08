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
	@Test
	public void deveEntenderOSimboloXX() {
		ConversaoRomana romano = new ConversaoRomana();
		int numero = romano.converte("XX");
		assertEquals(20, numero);
	}
	@Test
	public void deveEntenderOSimboloXXX() {
		ConversaoRomana romano = new ConversaoRomana();
		int numero = romano.converte("XXX");
		assertEquals(30, numero);
	}
	@Test
	public void deveEntenderOSimboloXIX() {
		ConversaoRomana romano = new ConversaoRomana();
		int numero = romano.converte("XIX");
		assertEquals(19, numero);
	}
	
	
}
