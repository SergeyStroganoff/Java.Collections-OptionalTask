package com.stroganov;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    private static List<String> readAllSubFiles(@NotNull File baseDirectory) {

        List<String> fileList = new ArrayList<>();

        if (baseDirectory.isDirectory()) {
            for (File file : baseDirectory.listFiles()) {

                if (file.isFile()) {

                    fileList.add(file.getName() + " файл");
                } else {
                    fileList.add(file.getName() + " каталог");
                    fileList.addAll(readAllSubFiles(file));
                }
            }

        }
        return fileList;
    }

    public static List<String> readAllSubFiles(String baseDirectoryString) {

        File baseDirectory = new File(baseDirectoryString);
        return readAllSubFiles(baseDirectory);

    }


}
