package tdd.estudo1;

public class Ordena3Numeros {
	private int a, b, c;
	
	
	public Ordena3Numeros(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	public void ordena() {
		int troca;
		if (this.a > this.b) {
			troca = this.a;
			this.a= this.b;
			this.b= troca;
		}
		
		if (this.b > this.c) {
			troca = this.b;
			this.b= this.c;
			this.c= troca;
		}
		
		if (this.a > this.b) {
			troca = this.a;
			this.a= this.b;
			this.b= troca;
		}
		
	}


	
	
	//get 
	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}


	public int getC() {
		return c;
	}
	
	
}
