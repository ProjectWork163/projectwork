package com.mycompany.shell;

import java.io.File;


public class MkDir {
    public static void main(String[] args){
    File f = null;
     boolean bool = false;  
      try
      {      
         f = new File("C:/Test");
         bool = f.mkdir(); 
         System.out.print("Directory created? "+bool);
      }
      catch(Exception e) 
      {
         e.printStackTrace();
      }  
      
}
}