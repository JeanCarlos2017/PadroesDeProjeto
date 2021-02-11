package tdd.estudo1.salario;

public class CalculadoraSalario {

	
	/*
	 * As regras de negócio são as seguintes:
		• Desenvolvedores possuem 20% de desconto caso seu salário seja maior do que
		R$ 3000,0. Caso contrário, o desconto é de 10%.
		32
		• DBAs e testadores possuem desconto de 25% se seus salários forem maiores
		do que R$ 2500,0. 15%, em caso contrário.

	 */
	
	public double calculaSalario(Funcionario desenvolvedor) {
		// TODO Auto-generated method stub
		//desenvolvedor 
		if(desenvolvedor.getCargo() == Cargo.DESENVOLVEDOR) {
			if (desenvolvedor.getSalario() > 3000)	return desenvolvedor.getSalario() * 0.8;
			else return desenvolvedor.getSalario() * 0.9;
		}
		
		//DBA 
		if(desenvolvedor.getCargo() == Cargo.DBA) {
			if (desenvolvedor.getSalario() < 2500) return desenvolvedor.getSalario() * 0.85;
		}
		return 0;
	}
	
}
