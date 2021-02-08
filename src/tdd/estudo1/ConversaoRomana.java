package tdd.estudo1;

public class ConversaoRomana {
	public int converte(String numero) {
		if (numero.equals("I")) return 1;
		else if(numero.equals("V")) return 5;
		return 0;
	}
}
