package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static Scanner scan = new Scanner(System.in);

	public static double entrada, verificar;
	public static int saqueCEM, saqueCIN, saqueVIN, saqueDES, saqueCI, saqueDO, verificar1;

	public static void main(String[] args) {

		myMethod();
		myMethod1();
		while(entrada % 2 == 0 | entrada % 5 == 0 ){
			entrada = 0;
			saqueCEM = 0;
			saqueCIN = 0;
			saqueVIN = 0;
			saqueDES = 0;
			saqueCI = 0;
			saqueDO = 0;
			myMethod();
			myMethod1();
		}
	}

	private static void myMethod1() {

		if(saqueCEM > 0){
			System.out.println(saqueCEM + " Notas de R$ 100");
		}
		if(saqueCIN > 0){
			System.out.println(saqueCIN + " Notas de R$ 50");
		}
		if(saqueVIN > 0){
			System.out.println(saqueVIN + " Notas de R$ 20");
		}
		if(saqueDES > 0){
			System.out.println(saqueDES + " Notas de R$ 10");
		}
		if(saqueCI > 0){
			System.out.println(saqueCI + " Notas de R$ 5");
		}
		if(saqueDO > 0){
			System.out.println(saqueDO + " Notas de R$ 2");
		}

	}

	private static void myMethod() {

		System.out.println("Digite a quantidade que queira sacar");

		double valor = scan.nextDouble();
		entrada = valor;

		if(entrada % 2 != 0 | entrada % 5 != 0 ){
			System.out.println("Favor inserir um valor valido");
		}

		while((entrada > 0 & entrada % 2 == 0) | (entrada > 0 & entrada % 5 == 0)){

			if(entrada >= 100 & entrada % 100 == 0){
				entrada = entrada - 100;
				saqueCEM++;
			}
			else if(entrada >= 50 & entrada % 50 == 0){
				entrada = entrada - 50;
				saqueCIN++;
			}
			else if(entrada >= 20 & entrada % 20 == 0){
				entrada = entrada - 20;
				saqueVIN++;
			}
			else if(entrada >= 10 & entrada % 10 == 0){
				entrada = entrada - 10;
				saqueDES++;
			}
			else if(entrada >= 5 & entrada % 5 == 0){
				entrada = entrada - 5;
				saqueCI++;
			}
			else if(entrada >= 2 & entrada % 2 == 0){
				entrada = entrada - 2;
				saqueDO++;
			}
		}
	}
}
