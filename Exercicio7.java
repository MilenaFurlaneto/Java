package Atividade240523;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double x, y = 0, valor;
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Regra de três");
		System.out.println("X% de y = valor");
		System.out.print("Digite o valor de x: ");
		
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y: ");
		x = teclado.nextDouble();
		
		valor = (x*y) / 100;
		System.out.println(x + "% de " + y + "=" + formatador.format(valor));		
	}

}
