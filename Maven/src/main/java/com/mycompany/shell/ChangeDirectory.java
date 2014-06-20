package com.mycompany.shell;

import java.io.File;

public class ChangeDirectory {
    
    private File current;
    Object getCurrent;
   
    public ChangeDirectory(String initialPath) {
        if (initialPath != null) {
            current = new File(initialPath);
        } else {
            current = new File("");
        }
    }
    
    public ChangeDirectory() {
        current = new File("");
    }

    public File cd(String path) throws Exception {
        //toLowerCase - перевод символов в нижний регист.
        //startsWith - меотд проверки строки на указанный префикс
        boolean isDiskChanged = path.toLowerCase().startsWith("c:") || path.toLowerCase().startsWith("d:");
        boolean isParentDir = path.equals("..");
        File newCurrent = isParentDir 
                ?  new File(current.getAbsolutePath()).getParentFile()
                : isDiskChanged 
                    ?  new File(path) 
                    : new File(current, path);
        //isDirectory проверка на то, является ли файл директорией.
        if (!newCurrent.isDirectory()) {
            throw new Exception("path is not a directory");
        }
        current = newCurrent;
        return current;
    }
           
    public File getCurrent() {
        return current;
    }
}
