package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Quarto;

public class Main {

	public static void main(String[] args) {
		
		/* O programa lê nome, email e o quarto que a pessoa deseja alugar. */
		/* O programa salva em um vetor de quartos, os quartos alugados. */
		/* Exercício em Java para treinamento de for, vetores e classes. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vetorQuartos = new Quarto[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int nQuartos = sc.nextInt();
		
		for(int i=0;i<nQuartos;i++) {
			System.out.println("Dados do cliente: ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Qual o número do quarto escolhido?");
			int numeroQuarto = sc.nextInt();
			vetorQuartos[numeroQuarto] = new Quarto(nome, email);
		}
		
		System.out.println("=============================");
		System.out.println("Quartos ocupados: ");
		
		for(int i=0;i<vetorQuartos.length;i++) {
			if(vetorQuartos[i] != null) {
				System.out.println("Quarto número: "+i);
				System.out.println(vetorQuartos[i]);
			}
		}
		
	}

}
