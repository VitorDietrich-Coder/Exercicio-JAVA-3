package Exercicio;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static Scanner scan = new Scanner(System.in);
	public static NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	public static String op;
	public static double deposito, saque, salario = 0;
	public static boolean sair = false;

	public static void main(String[] args) {

		myMethod();
		while(sair == false){
			myMethod();
		}
	}

	private static void myMethod() {

		System.out.println("Escolha uma das opções");
		System.out.println("a) - Consulta saldo");
		System.out.println("b) - Saque");
		System.out.println("c) - Depósito");
		System.out.println("d) - Sair");

		String valor1 = scan.next();
		op = valor1;

		switch(op) {

			case "a":
				System.out.println("Seu sado atual é:");
				System.out.println(formatter.format(salario));
			break;

			case "b":
				System.out.println("Digite o seu saque");
				double valor2 = scan.nextDouble();
				saque = valor2;
				salario -= saque;

				if(salario >= 0) {

					System.out.println("Seu saldo atual é:");
					System.out.println(formatter.format(salario));
				}
				else {
					salario = 0;
					System.out.println("Saldo indisponível");
				}
			break;

			case "c":
				System.out.println("Digite o seu deposito");
				double valor3 = scan.nextDouble();
				deposito = valor3;

				salario += deposito;
				System.out.println("Seu saldo atual é:");
				System.out.println(formatter.format(salario));
			break;

			case "d":
				sair = true;
				System.out.println("Sair");
			break;

			default:
				System.out.println("Digite um opção valida");
		}
	}
}
