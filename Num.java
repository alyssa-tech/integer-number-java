package LAB4;

import java.util.Scanner;

public class Num {
	public static void main (String [] args) {
	      int num; //declare variables
	      Scanner scanner = new Scanner (System.in);
	      
	      //read input
	      System.out.print ("Enter an integer num = ");
	      num = scanner.nextInt (); 
	      
	      if (num > 0)
	    	 System.out.println ("Positive");
	    
	      else if (num < 0)
	       System.out.println ("Negative");
	      
	      else 
		   System.out.println ("Zero");
	      
	}
}
