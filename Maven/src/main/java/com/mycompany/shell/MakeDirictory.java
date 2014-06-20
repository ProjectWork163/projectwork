package com.mycompany.shell;
import java.io.File;

public class MakeDirictory {
    
    private File Ans;
   
    
    private boolean bool = false; 
    
    public File NewFolder(String path, String fname) {
    try
      {      
         
         Ans = new File(path, fname) ;
         bool = Ans.mkdir(); 
      }
      catch(Exception e) 
      {
         e.printStackTrace();
      } 
    return Ans;
    }
}