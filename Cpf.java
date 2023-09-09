package Cpf;

import java.util.Scanner;

public class Cpf {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite o seu cpf: ");
	String ns = entrada.next();
	
	ns = ns.replaceAll("[^0-9]","");
	
	int num1 = Character.getNumericValue(ns.charAt(0));
	int num2 = Character.getNumericValue(ns.charAt(1));
	int num3 = Character.getNumericValue(ns.charAt(2));
	int num4 = Character.getNumericValue(ns.charAt(3));
	int num5 = Character.getNumericValue(ns.charAt(4));
	int num6 = Character.getNumericValue(ns.charAt(5));
	int num7 = Character.getNumericValue(ns.charAt(6));
	int num8 = Character.getNumericValue(ns.charAt(7));
	int num9 = Character.getNumericValue(ns.charAt(8));
	int num10 = Character.getNumericValue(ns.charAt(9));
	int num11 = Character.getNumericValue(ns.charAt(10));
	
	int[] cpf = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11};
	
	int d1 = (num1*10) + (num2*9) + (num3*8) + (num4*7) + (num5*6) + (num6*5) + (num7*4) + (num8*3) + (num9*2);
	
	if (d1 % 11 == 0 || d1 % 11 == 1) {
			d1 = 0;
		}else {
			d1 = 11-(d1%11);
		}
			
	int d2 = (num2*10) + (num3*9) + (num4*8) + (num5*7) + (num6*6) + (num7*5) + (num8*4) + (num9*3) + (d1*2);

	if (d2 % 11 == 0 || d2 % 11 == 1) {
			d2 = 0;
		}else {
			d2 = 11-(d2%11);
		}
			
	if (num10!=d1 || num11!=d2) {
			System.out.println("Cpf Inválido!!!");
		}else {
			System.out.println("Cpf valido!!!");
		}
	
	}
}
