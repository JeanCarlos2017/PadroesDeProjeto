package tdd.estudo1;

import java.util.HashMap;
import java.util.Map;

public class ConversaoRomana {
	
	private static Map<Character, Integer> tabela =
			new HashMap<Character, Integer>() {{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
	}};
	
	public int converte(String numero) {
		int conversao = 0;
		int tamanhoString = numero.length();
		
		for (int i = 0; i < tamanhoString; i++) {
			conversao+= tabela.get(numero.charAt(i));
		}
		return conversao;
	}
	
}
