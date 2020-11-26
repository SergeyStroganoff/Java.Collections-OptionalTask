package com.stroganov;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {


    public static boolean reverseFile(String filePathToRead, String filePathToWrite) {

        boolean result = true;

        ArrayList<String> stringList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePathToRead)))) { // StandardCharsets.UTF_8
            String line;
            while ((line = reader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла : " + filePathToRead + e.getMessage());
            result = false;
        }

        if (!stringList.isEmpty()) {

            Collections.reverse(stringList);

            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePathToWrite)))) { // StandardCharsets.UTF_8
                String line;

                for (String currentString : stringList) {
                    writer.write(currentString);
                    writer.append('\n');
                }

                writer.flush();

            } catch (IOException e) {
                System.out.println("Ошибка записи файла : " + filePathToRead + e.getMessage());
                result = false;
            }

        }


        return result;

    }

}
