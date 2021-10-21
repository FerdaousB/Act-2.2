package act221;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Nb;
		Scanner sc = new Scanner(System.in);
                System.out.println(" Saisir un nombre entre 10 et 30 inclus : ");
		Nb =sc.nextInt();
		
		 try {
			 
	           
			 if (Nb < 30 || Nb > 10) {
			        throw new Exception(" The value is not in the allowed interval");
			        
			 }
			    
	           
	             } catch (Exception e) {
	        	
	             e.printStackTrace();
	        } 
	    }
        
	}


