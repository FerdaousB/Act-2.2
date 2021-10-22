package act225;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SautoLit {

	 static void lecture(Scanner source) throws IOException {
	       	    
		 while(source.hasNextLine()) {
	    	   
	          String Line = source.nextLine();
	     	  System.out.println(Line);  		  

	         }
	         }

	 
	  static public void main(String[] args) throws IOException {

		   
			 String line;
			 BufferedReader br = new BufferedReader(new FileReader("src/act225/monFichier_L2.txt"));       
		     StringBuffer sb = new StringBuffer();    
		     ArrayList<String>  lignes= new ArrayList<String> () ;

		     while((line = br.readLine()) != null)
		     {
		        sb.append(line);      
		        sb.append("\n");    
		        lignes.add(line);

		     }
		     System.out.println(sb.toString());  	  
		     Collections.reverse(lignes);
		     for(int i = 0 ; i < lignes.size(); i++)
		     {  
		    	 System.out.println(lignes.get(i));		     	     
		     }
		     
	         for (int i =0 ; i<lignes.size(); i++) {
	        	 
			     File myObj = new File("src/act225/monFichier_L"+i+".txt");
			     myObj.createNewFile() ;
			     FileWriter myWriter = new FileWriter("src/act225/monFichier_L"+i+".txt");
			     myWriter.write(lignes.get(i));
			     myWriter.close();			 
			
		      }
	 
	          }
	  
	  
	  
}
