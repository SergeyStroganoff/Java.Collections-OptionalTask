package com.stroganov;

/*
Optional Task
        Задания из раздела "Additional Unit" являются вспомогательными для курса "Коллекции". В процессе изучения разделов курса рекомендуется решить 3-5 задач из списка.
        1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        2.   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        3.   Создать список из элементов каталога и его подкаталогов.
        4.   Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
        5. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
        6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
        7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
        8. Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
*/

import java.util.List;

public class Main {

    public static void main(String[] args) {


        if (Task1.reverseFile("task.txt", "ksat.txt")) System.out.println("копирование файла завершено");

        Task2.reverseStringStack();

        List<String> newFileList = Task3.readAllSubFiles("C:\\web");
        for (String file : newFileList) {
            System.out.println(file);
        }
        Task7.checkString("{(sf<sdfs>)dfsdf}");


    }
}
