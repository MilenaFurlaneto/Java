package activity25042023;

 import java.util.Scanner;

public class exercicio10 {
	
	public static void main (String[]args) {
	 Scanner s = new Scanner(System.in);
	 
	 double n1;
	 
	 System.out.println("Digite um numero:");
	 n1 = s.nextDouble();
	 
	 for(int i = 1; i <= 1000;i++) {
		 if (((n1 % i) ==0)) {
			  System.out.println("O numero" + n1 + "e Divisivel por:"+ i);
			  
		 }
	 }
	}

}

