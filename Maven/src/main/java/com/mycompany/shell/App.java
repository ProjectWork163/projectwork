package com.mycompany.shell;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    
    private static ChangeDirectory cd = new ChangeDirectory();
    
    public static void main(String[] args) {
        System.out.println("Current: " + cd.getCurrent().getAbsolutePath());
        try {
            cd.cd("..");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        System.out.println("Current: " + cd.getCurrent().getAbsolutePath());
    }
}
