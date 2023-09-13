package Ex_C_Miguel;

import java.util.Scanner;

public class Ex_C_Miguel {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Qual o valor em reais: ");
	double a = entrada.nextDouble();
	
	System.out.print("Se você deseja a conversão para Dólar digite 1, Euro digte 2, Libra esterlina 3 e Peso Argetino 4: ");
	int b = entrada.nextInt();
	
	switch (b) {
		case 1:
		System.out.println("O valor em dolar é: " + (a/4.87));
		break;
		case 2:
		System.out.println("O valor em Euro é: " + (a/5.26));
		case 3:
		System.out.println("O valor em libra Esterlina é: " + (a/6.13));
		case 4:
		System.out.println("O valor em Peso Argentino é: " + (71.91*a));
		
	}
}
}
