package Atividade240523;
import java.util.Scanner;

public class Exercicio06 {
		private static Scanner dados;

		public static void main (String args[]) {
			dados = new Scanner (System.in);
			Double Cateto1, Cateto2, Hipotenusa;
			
			System.out.print(" Teorema de Pitágoras ");
			System.out.println ("Qual o primeiro cateto?");
			Cateto1 = dados.nextDouble ();
			System.out.print ("Qual o segundo Cateto?");
			Cateto2 = dados.nextDouble ();
			Hipotenusa= Math.sqrt (Math.pow(Cateto1, 2) + Math.pow(Cateto2, 2));
			
			
			System.out.printf ("Hipotenusa = " + Hipotenusa);
	}
			     
			
	}


