package Atividade240523;
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	try (Scanner input = new Scanner (System.in)) {
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		
		System.out.println("Seu nome é " + nome + " e você tem " + idade + "anos de idade.");
}	
}
}

