package act222;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWithoutExceptions {

	public static void main(String[] args)  throws IOException{
    
		try {
		  
	           BufferedReader br = new BufferedReader(new FileReader("src/act222/data.txt"));
	           // could generate FileNotFoundException (checked)
	           int max = -1;
	           String line = br.readLine();
	           // peut générer IOException
	           while (line != null) {
	           int n = Integer.parseInt(line);
	           // peut générer NumberFormatException
	           if (n > max) max = n;
	           line = br.readLine(); 
	           // peut générer IOException
	        }
	        
	           System.out.println("Maximum = " + max);
	    }
		
					
		catch (FileNotFoundException ex) {
		    System.out.println(" File does not exist");
		     }	
		
		catch (IOException e) {
		    System.out.println("The file cannot be read.");
	    }
		
		catch (NumberFormatException e) {
		    System.out.println("The file contain no numeric data .");
		}
		
		catch (Exception e) {
		    System.out.println(e.getMessage());
		    }
		
		}
	    }

