/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shell;

import java.io.File;

/**
 *
 * @author kuzyaev_nikolay
 */
public class Remove {

    public void Del(String path, String name){
         File file = new File(path,name);
          file.delete();
    }
}
