/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shell;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author kuzyaev_nikolay
 */
public class Remove {

    public void del(String path, String name) throws Exception {

        
        
        File file = new File(path, name);

        try {
            if (!file.delete()) {
                throw new Exception("File can not be deleted");
            }
        } catch (IOException e) {
            throw new Exception("22");
        }
        System.out.println("File " + name + " is deleted");
    }

}
