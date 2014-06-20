package com.mycompany.shell;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

    private static ChangeDirectory cd = new ChangeDirectory();
    private static ListFiles list = new ListFiles();
    private static MakeDirictory mkdir = new MakeDirictory();
    private static Remove rm = new Remove();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String text = "";
        while (n != 0) {
            System.out.print("Current: " + cd.getCurrent().getAbsolutePath() + "> ");
            text = sc.nextLine();
          //  try {
          //      cd.cd(text);

           // } catch (Exception ex) {
          //      System.out.println(ex.getMessage());
          //  }
            
            rm.Del(cd.getCurrent().getAbsolutePath(), text);
        }
    }
}
