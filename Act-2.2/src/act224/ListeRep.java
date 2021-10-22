package act224;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ListeRep {
	
	
	private String PathRep = "";
    public int filecount = 0;
    public int dircount = 0;
    
    public ListeRep(String PathRep) {
        
        this.PathRep = PathRep;
    }

    public void list() {
        this.listDirectory(this.PathRep);
    }
   
    private void listDirectory(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
            	
                if (files[i].isDirectory() == true) {
                    System.out.println("  Dossier : " + files[i].getName());
                    listDirectory(file.getName());
                    
                    this.dircount++;

                } else {
                    System.out.println("  Fichier : " + files[i].getName());
                    this.filecount++;

                }
                
            }
        }
    }
    
    
   
        
        
    
}
