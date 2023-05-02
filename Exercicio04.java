package Atividade240523;
import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
	try (Scanner input = new Scanner (System.in)) {
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite sua data de nascimento: ");
		int ano= input.nextInt();
		
		int idade = 2023-ano;
		
		System.out.println("Seu nome é " + nome + " e você tem " + idade + "anos de idade.");
	}
}
}

