package Exd_Miguel;

import java.util.Scanner;

public class Exd_Miguel {

	private static String soma2;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Aqui está sendo definido n, a posição do número que sera inserido, se é o décimo número, segundo número e etc...
		int n=3;
		
		// Aqui está sendo definido as variáveis do primeiro e segundo número, para poder realizar a lógica.
		System.out.println("Insira o número 1: ");
		int g = entrada.nextInt();
		System.out.println("Insira o número 2: ");
		int t = entrada.nextInt();
		//Aqui a variável p está se igualhando a g para poder realizar a lógica nas linhas 34 e 35 
		int p = g;
		int gr = 0;
		//Aqui eu declaro como a soma, a soma de a mais b no início, pois o valor deles ira mudar conforme o programa.
		float soma = g+t;
		// Aqui eu abro uma estrutura de repetição para que só possa mostrar o maior, menor, soma e média dos números após ser inserido todos os números.
		do {

		
			for(;n<=10;n++) {
					System.out.println("Insira o número "+n+" : ");//Aqui para eu não de dlecarar variável por variável eu crio uma estrutura de repetição.
					int b = entrada.nextInt();// Falo que o valor de b, é igual ao valor INTEIRO inserido pelo usuário.
					int b2 = b; //Aqui eu estou atribuindo o valor de b a váriavel b2.
					int f =b2; // Aqui eu estou atribuindo o valor de b2 a variavel f.
					int rt = b;// Aqui eu atribuo a variável rt o valor b, para que eu possa fazer a conta.
					if(b2 >=g) { // Aqui eu comparo o tamanho de b2 com g.
						g = b2; // Aqui eu falo que se b2 for maior que g, g tera o valor de b2
						}if(t>=g){// aqui eu camparo o tamanho de t com g.
							g = t;}			// Aqui eu falo que se t for maior que g, g tera o valor de t
					if(p<=t){// Aqui eu comparo o valor de p ,que é o primeiro valor de g, a t ,pois g ja não tem o seu valor inicial.
							t = p;// Aqui eu falo que se p for menor t, t passa a ter o valor p.
							}else if(f<= t) { //Aqui eu comparo o valor de f, que é valor inicial de b2 que é b, com t.
								t = f;}// Aqui eu falo que se for menor que t, t passar a ter o valor de f.
					if(rt>=-12433244) {//Aqui eu comparo a grandeza de rt, a mesma de b, ao menor valor possivel para um int.
						soma = (rt+soma);}// Aqui eu falo que se o valor de rt, igual ao valor de b, for maior ou igual ao limite negativo de um int, o seu valor sera somado a minha variável soma.
					
							}
			}while(n<=10);//Aqui eu falo que se minha variável n for igual a 10 o loop acaba.
		
		//Aqui eu mando printar o maior, menor, media e a soma dos valores.
		System.out.println("O maior número é: "+g);
		System.out.println("O menor número é: "+t);
		System.out.println("A soma dos números é: "+soma);
		System.out.println("A média dos números é: "+soma/10);
		
		
	}
}

