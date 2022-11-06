package br.com.erickfreire.contabancaria;

import java.util.Scanner;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Joao Silva", 50.00);
		ContaBancaria conta2 = new ContaBancaria("Maria Fernandes", -7.53);
		
		Scanner entrada = new Scanner(System.in);
		double valorDeposito;
		
		ContaBancaria.mostraConta(conta1);
		ContaBancaria.mostraConta(conta2);
		
		System.out.print("Informe um valor para despositar na conta 1: ");
		valorDeposito = entrada.nextDouble();		
		
		System.out.printf("Despositando o valor %.2f na conta 1%n", valorDeposito);
		
		conta1.deposita(valorDeposito);
		
		ContaBancaria.mostraConta(conta1);
		ContaBancaria.mostraConta(conta2);
		
		System.out.print("Informe um valor para despositar na conta 2: ");
		valorDeposito = entrada.nextDouble();		
		
		System.out.printf("Despositando o valor %.2f na conta 2%n", valorDeposito);
		
		conta2.deposita(valorDeposito);
		
		ContaBancaria.mostraConta(conta1);
		ContaBancaria.mostraConta(conta2);	
		
		System.out.print("Informe um valor para retirar da conta 1: ");
		valorDeposito = entrada.nextDouble();		
		
		System.out.printf("Retirando o valor %.2f na conta 1%n", valorDeposito);
		
		conta1.retira(valorDeposito);
		
		ContaBancaria.mostraConta(conta1);
		ContaBancaria.mostraConta(conta2);
		
		
		
	}

}
