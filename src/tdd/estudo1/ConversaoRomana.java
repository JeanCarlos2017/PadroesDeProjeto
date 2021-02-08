package tdd.estudo1;

import java.util.HashMap;
import java.util.Map;

public class ConversaoRomana {
	
	@SuppressWarnings("serial")
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
		int atual; //posição que eu estou lendo 
		int proximo; 
		int tamanhoString = numero.length();
		
		for (int i = 0; i < tamanhoString; i++) {
			//pego o valor atual 
			atual = tabela.get(numero.charAt(i));
			//pego o próximo valor 
			if (i+1 < tamanhoString) {
				proximo = tabela.get(numero.charAt(i+1));
			}else {
				proximo= 0;
			}
			//faço as comparações 
			if (atual < proximo) {
				atual *= -1;
			}
			conversao+= atual;
		}
		return conversao;
	}
	
}
