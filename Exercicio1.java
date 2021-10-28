package Exercicio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static Scanner scan = new Scanner(System.in);
	public static NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	public static DecimalFormat formatterD = new DecimalFormat("#.00");

	public static int idade, idadeC ,idadeN, idadeM, pessoas, pessoasM, pessoasF;
	public static String ge, geC;
	public static double salario, salarioC ,salarioS, salarioME, salarioN, salarioM;


	public static void main(String[] args) {

		myMethod4();
		myMethod3();
		myMethod2();
		while(idade > 0){
			myMethod4();
			myMethod3();
			myMethod2();
		}
		myMethod1();
	}

	private static void myMethod4() {

		System.out.println("Digite sua idade");
		int valor1 = scan.nextInt();

		idade = valor1;
		if (idade < 0){
		}
		else {

			if (idade < 0){
			}
			else if (valor1 > idadeM){
				idadeM = valor1;
			}
			else {
				idadeN = valor1;
			}
		}
	}

	private static void myMethod3() {

		if (idade < 0){
		}
		else {

			System.out.println("Digite seu salario");
			double valor3 = scan.nextDouble();
			pessoas++;
			salario = valor3;

			salarioS += valor3;
			salarioME = salarioS/pessoas;

			if (salarioN == 0 && salarioM == 0){
				salarioN = valor3;
				salarioM = valor3;
			}
			if (valor3 < salarioN){
				salarioN = valor3;
			}
			else if(valor3 > salarioM){
				salarioM = valor3;
			}
		}
	}

	private static void myMethod2() {

		if (idade < 0){
		}
		else {

			System.out.println("Digite seu gênero usando 'm' ou 'f'");
			String valor2 = scan.next();

			ge = valor2;

			switch(ge) {
				case "m":
				pessoasM++;
				break;

				case "f":
				pessoasF++;
				break;

				default:
				System.out.println("Digite um opção valida");
			}

			if (salario > salarioN){
				salarioC = salario;
				idadeC = idade;
				geC = ge;
			}
			else if(salario == salarioN){
				salarioC = salario;
				idadeC = idade;
				geC = ge;
			}
		}
	}

	private static void myMethod1() {

		System.out.println("Respostas");
		System.out.println("Media de Salario: " + formatterD.format(salarioME));
		System.out.println("Maior idade: " + idadeM + " " + "Menor idade: " + idadeN);
		System.out.println("Quantidade de Homens: " + pessoasM + " " + "Quantidade de Mulheres: " + pessoasF);
		System.out.println("Idade: " + idadeC + " " + "Gênero : " + geC + " " + "Salario : " + formatter.format(salarioC));
	}
}