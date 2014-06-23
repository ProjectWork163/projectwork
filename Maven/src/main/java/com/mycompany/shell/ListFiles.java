/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shell;

import java.io.File;
import java.util.Date;

/**
 *
 * @author kuzyaev_nikolay
 */
class ListFiles {

    public void ls(String patch) {
        System.out.println("--------------------------------------");
        String list[] = new File(".").list();
        for (int i = 0; i < list.length; i++) {
            File file = new File(list[i]);
            long len = file.length();
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);
            System.out.println("Name: " + list[i] + "   Size: " +len + "b" + "   Last Modified: " + String.valueOf(date));
        }
        System.out.println("--------------------------------------");

    }

}
