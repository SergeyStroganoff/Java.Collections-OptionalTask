package com.stroganov;

import java.io.File;

public class Task3 {


    public static void readFiles(File baseDirectory) {
        if (baseDirectory.isDirectory()) {
            for (File file : baseDirectory.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName() + " файл");
                } else {
                    System.out.println(file.getName() + " каталог");
                    readFiles(file);
                }
            }
        }
    }


}
