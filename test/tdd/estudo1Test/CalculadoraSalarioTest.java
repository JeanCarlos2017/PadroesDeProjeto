package tdd.estudo1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.estudo1.salario.CalculadoraSalario;
import tdd.estudo1.salario.Cargo;
import tdd.estudo1.salario.Funcionario;

class CalculadoraSalarioTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario ("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void	deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario	("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}
	@Test
	public void deveCalcularSalarioParaDBAComSalarioAbaixoDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario	("MauricioDBA", 1500, Cargo.DBA);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500 * 0.85, salario, 0.00001);
	}

}
