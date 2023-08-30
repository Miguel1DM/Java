package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		// Entrada.
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantos votos você deseja para o Candidato A: ");
	int candA = entrada.nextInt();
	
	System.out.println("Quantos votos você deseja para o Candidato B: ");
	int candB = entrada.nextInt();
	
	System.out.println("Quantos votos você deseja para o Candidato C: ");
	int candC = entrada.nextInt();
	
	System.out.println("Quantos votos Nulos você deseja: ");
	int nulo = entrada.nextInt();
	
	System.out.println("Quantos votos em branco você deseja: ");
	int branco = entrada.nextInt();
	
		// Processamento.
	
	int invalidos = branco + nulo;
	int total = branco + nulo + candC + candB +candA;
	int validos = (candC + candB + candA);
	float PCvalidos = (validos*100)/total;
	float PCcandA = (candA*100)/total;
	float PCcandB = (candB*100)/total;
	float PCcandC = (candC*100)/total;
	float PCnulo = (nulo*100)/total;
	float PCbranco = (branco*100)/total;
	
		// Saida.
	
	System.out.println("O total de eleitores foi de: "+ total);
	System.out.println("O percentual de votos validos em relação a quantidade de eleitores é: "+ PCvalidos+"%");
	System.out.println("O percentual de votos validos do candidato A em relação a quantidade de eleitores é: "+ PCcandA+"%");
	System.out.println("O percentual de votos validos do candidato B em relação a quantidade de eleitores é: "+ PCcandB+"%");
	System.out.println("O percentual de votos validos do candidato C em relação a quantidade de eleitores é: "+ PCcandC+"%");
	System.out.println("O percentual de votos nulos em relação a quantidade de eleitores é: "+ PCnulo+"%");
	System.out.println("O percentual de votos em branco em relação a quantidade de eleitores é: "+ PCbranco+"%");
	
	if ((PCcandA > PCcandB) && (PCcandA > PCcandC)) {
		
		System.out.println("O ganhador é o Cadidato A");
		
	}else if (PCcandB > PCcandA && PCcandB >PCcandC) {
		
		System.out.println("O ganhador é o Candidato B");
		
	}else {
		
		System.out.println("O ganhador é o Candidato C");
	}

		}
	}