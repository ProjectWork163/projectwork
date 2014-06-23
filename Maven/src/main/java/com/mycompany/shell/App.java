package com.mycompany.shell;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class App {

    private static ChangeDirectory cd = new ChangeDirectory();
    private static ListFiles list = new ListFiles();
    private static MakeDirictory mkdir = new MakeDirictory();
    private static Remove rm = new Remove();

    public static void main(String[] args) throws IOException, Exception {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String text = "";

        while (n != 0) {
            System.out.print("Current: " + cd.getCurrent().getAbsolutePath() + ">");
            text = sc.nextLine();
            String[] s = text.split(" ");
            if ("cd".equals(s[0])) {
                try {
                    cd.cd(s[1]);

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
            if ("remove".equals(s[0])) {
                try {
                    rm.del(cd.getCurrent().getAbsolutePath(), (s[1]));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if ("mkdir".equals(s[0])) {
                mkdir.newfolder(cd.getCurrent().getAbsolutePath(), (s[1]));
            }
            
            if ("ls".equals(s[0])) {
                list.ls(cd.getCurrent().getAbsolutePath());
            }

            if ("exit".equals(s[0])) {
                n = 0;
                System.out.println("Log out");
            }
       

        }
    }
}
