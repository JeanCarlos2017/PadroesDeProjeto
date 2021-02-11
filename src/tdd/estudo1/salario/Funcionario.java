package tdd.estudo1.salario;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargo cargo;
	
	//construtor 
	public Funcionario(String nome, double salario, Cargo cargo) {
	this.nome = nome;
	this.salario = salario;
	this.cargo = cargo;
	}
	
	
	//get and set 
	public String getNome() {
	return nome;
	}
	public double getSalario() {
	return salario;
	}
	public Cargo getCargo() {
	return cargo;
	}

}
