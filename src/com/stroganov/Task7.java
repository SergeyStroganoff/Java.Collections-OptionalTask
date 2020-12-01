package com.stroganov;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task7 {

    public static char getOppositeChar(char currentChar) {

        char result;
        switch (currentChar) {

            case '>': {
                result = '<';
                break;
            }
            case '}': {
                result = '{';
                break;
            }
            case ')': {
                result = '(';
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + currentChar);
        }
        return result;
    }

    public static void checkString(String taskString) {


        char[] charsFromTaskString = taskString.toCharArray();
        Deque<Character> charDeque = new ArrayDeque<>();

        for (char nextchar : charsFromTaskString) {

            if (nextchar == '(' || nextchar == '{' || nextchar == '<') {
                charDeque.push(nextchar);
            }
            if (nextchar == ')' || nextchar == '}' || nextchar == '>') {

                if (!charDeque.isEmpty()) {
                    Character current = charDeque.pop(); //({})
                    if (current != getOppositeChar(nextchar)) {
                        System.out.println("Строка не корректная " + "символ: " + nextchar + " не на своем месте");
                        return;
                    }
                }
            }
        }
        System.out.println("Строка корректная");
    }
}
