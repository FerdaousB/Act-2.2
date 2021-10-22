package act226;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AnalyseTexte {

	public static void main(String[] args) throws IOException {

	       
		             BufferedReader br = new BufferedReader(new FileReader("src/act226/Texte1.txt"));       
			     StringBuffer sb = new StringBuffer();    
	                     String line ;
	 		     ArrayList<String>  lignes= new ArrayList<String> () ;
	 		     ArrayList<String>  words= new ArrayList<String> () ;

	 		     while((line = br.readLine()) != null)
			     {
			        sb.append(line);      
			        sb.append("\n");    
			        lignes.add(line);

			     }
			     System.out.println(sb.toString()); 
		
			     PrintWriter writer = new PrintWriter(new FileWriter("src/act226/nouveauTexte.txt"));
		
			     int i =0; 
			     while ( i < lignes.size() ) {
			    		 
				 words.add(lignes.get(i));
			    	 i=i+2;
				     
			      }			    	 			    	
			      writer.println(words);
			      writer.close();	      	    	
			      }
}
