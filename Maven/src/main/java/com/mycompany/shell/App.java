package com.mycompany.shell;

import java.io.IOException;

public class App {

    private static ChangeDirectory cd = new ChangeDirectory();
    private static ListFiles list = new ListFiles();
    private static MakeDirictory mkdir = new MakeDirictory();
    private static Remove rm = new Remove();

    public static void main(String[] args) throws IOException {
    }
    
    private static void checkCD() {
                //getAbsolutePath - получает строку пути без последней папки, выводит полный путь.
        System.out.println("Current: " + cd.getCurrent().getAbsolutePath());
         try {
         cd.cd("..");
         } catch (Exception ex) {
         //printStackTrace- диагностики исключение, что случилось и где произошло
             System.out.println(ex.getMessage());
         }
         System.out.println("Current: " + cd.getCurrent().getAbsolutePath());
         try {
         cd.cd("c:\\windows");
         } catch (Exception ex) {
         //printStackTrace- диагностики исключение, что случилось и где произошло
             System.out.println(ex.getMessage());
         }
         System.out.println("Current: " + cd.getCurrent().getAbsolutePath());
    }
}
