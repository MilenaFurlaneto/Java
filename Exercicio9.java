package activity25042023;
 
 import java.util.Scanner;

public class exercicio9 {
	
	public static void main (String[] angs){
	
	 Scanner s = new Scanner (System.in);
	 
	     double idade;
	     String nome;
	     
	     System.out.println ("Escreve seu nome:");
	     nome = s.next();
	     
	     System.out.println ("Escreva sua idade:");
	     idade = s.nextDouble ();
	     
	     if (idade >18) {
	    	 
	    	    System.out.println ("Voce e maior de idade");
	     }else {
	    	 System.out.println("Voce e menor de idade");
	    	
	     }
	}

}
