package activity25042023;

import java.util.Scanner;

public class exercicio8 {


    public static void main(String[] angs){
    	
    Scanner s = new Scanner (System.in);
    		
      double nl, n2, n3, n4 ;
       
      System.out.println ("Escreva um numero:");
       nl = s.nextDouble ();
       
      System.out.println ("Escreva outro numero");
      n2 = s.nextDouble ();
      
      
      System.out.println ("Escreva outro numero");
      n3 = s.nextDouble ();
      
      n4= (n2*n3)/nl;
       
       System.out.println ("n2 x n3 / nl = " + n4);
    }
}

