package com.stroganov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Task2 {

    public static void reverseStringStack() {

        String stringNumber = "";

        System.out.println("Введите любую последовательность чисел:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) { // StandardCharsets.UTF_8
            stringNumber = reader.readLine();

        } catch (IOException e) {
            System.out.println("Ошибка чтения строки : " + stringNumber + e.getMessage());

        }
        if (stringNumber.isEmpty()) {
            System.out.println("вы ввели пустую строку");
            return;
        }

        char[] stringChar = stringNumber.toCharArray();

        Stack stack = new Stack();

        for (int i = 0; i < stringChar.length; i++) {

            stack.push(stringChar[i]);
        }

        String newString = "";
        while (stack.size() > 0) {
            newString += (stack.pop());
        }
        System.out.println(newString);


        // List listOfChar = new ArrayList<>(Arrays.asList(stringChar)); // по какой причине мы не можем параметризовать


    }

}
