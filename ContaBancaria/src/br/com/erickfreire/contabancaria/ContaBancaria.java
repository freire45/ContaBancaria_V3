package br.com.erickfreire.contabancaria;

public class ContaBancaria {
	
	private String nome;
	private double saldo;
	
	
	
	public ContaBancaria(String nome, double saldo) {		
		this.nome = nome;
		
		if(saldo > 0.0)
		   this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double deposito) {
		if(deposito > 0.0) {
			saldo = saldo + deposito;
		}		
	}
	
	public void retira(double valor) {
		if(valor > saldo)
			System.out.printf("%dValor Excede Saldo da Conta - Valor n�o pode ser retirado!");
		
		if(valor < saldo)
			this.saldo =  this.saldo - valor;
	}
	
	public static void mostraConta(ContaBancaria conta)
	{
		System.out.printf("O saldo do Cliente %s é de %.2f%n", conta.getNome(), conta.getSaldo());
	}
	

}
