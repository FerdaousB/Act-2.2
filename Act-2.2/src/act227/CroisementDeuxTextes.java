package act227;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CroisementDeuxTextes {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new FileReader("src/act227/Texte1.txt"));  
		 BufferedReader br1 = new BufferedReader(new FileReader("src/act227/Texte2.txt"));       

	     StringBuffer sb = new StringBuffer();    
         String line ;
		 ArrayList<String>  lignes1= new ArrayList<String> () ;
		 ArrayList<String>  lignes2= new ArrayList<String> () ;
		 ArrayList<String>  lignes3= new ArrayList<String> () ;

		     while((line = br.readLine()) != null)
	     {
	        sb.append(line);      
	        sb.append("\n");    
	        lignes1.add(line);

	     }
		     
		     while((line = br1.readLine()) != null)
		     {
		        sb.append(line);      
		        sb.append("\n");    
		        lignes2.add(line);

		     }
	     System.out.println(sb.toString());
		
	     PrintWriter writer = new PrintWriter(new FileWriter("src/act227/nouveauTexte.txt"));
    	 int i =0;
    	 
    	 while ( i < lignes1.size() ) {
    		 while ( i < lignes2.size() ) {
    			 
    			 lignes3.add(lignes1.get(i));
    		     lignes3.add(lignes2.get(i));
    	 } 
	      }
    	 
    	
    	      writer.println(lignes3);
		      
    	      
		    	
}
		

	}


