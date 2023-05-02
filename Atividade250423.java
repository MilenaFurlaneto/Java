package Atividade240523;
import java.util.Scanner;

public class Atividade250423 {
public static void main (String args[]) {
	try (Scanner s = new Scanner (System.in)) {
		double numero1, numero2;
		System.out.println ("Entre com um número");
		numero1 = s.nextDouble ();
		
		System.out.println ("Entre com outro número");
		numero2 = s.nextDouble ();
		
		System.out.println (numero1*numero2);
	}
}
}

