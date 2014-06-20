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
public class ChangeDirectory {
    
    private File current;
   
    public ChangeDirectory() {
        current = new File(".");
    }
    
    public File cd(String path) throws Exception {
        boolean isDiskChanged = path.toLowerCase().startsWith("c:") || path.toLowerCase().startsWith("d:");
        File newCurrent = isDiskChanged ? new File(path) : new File(current, path);
        if (!newCurrent.isDirectory()) {
            throw new Exception("path is not a directody");
        }
        current = newCurrent;
        return current;
    }
    
    public File getCurrent() {
        return current;
    }
}
