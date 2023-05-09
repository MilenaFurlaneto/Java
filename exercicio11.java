package exercicio1;

import java.util.Scanner; 

public class exercicios11 {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	double n1;
	
	System.out.println("Digite Um Numero: ");
	n1 = s.nextDouble();
	
	for (int i = 1; i <= 1000; i++) {
		if (((n1 % i) ==0)) {
            System.out.println("O número " + n1 + " é Divisivel por: "+ i);
			}
		}
	}
}