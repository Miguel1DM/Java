package Ex_D_Miguel;

import java.util.Scanner;
import java.lang.Math;

public class Ex_D_Miguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		Float a = entrada.nextFloat();
		System.out.println("Digite o valor de B: ");
		double b = entrada.nextDouble();
		System.out.println("Digite o valor de C: ");
		Float c = entrada.nextFloat();
		
		double delta = Math.sqrt((Math.pow(b,2)) - (4 *a *c));
		
		double x1 = (-b + delta)/2*a;
		double x2 = (-b - delta)/2*a;
		
		System.out.println("O valor de X1 é: "+x1);
		System.out.println("O valor de X2 é: "+x2);
		System.out.println("O valor de delta é: "+delta);
		

	}

}
