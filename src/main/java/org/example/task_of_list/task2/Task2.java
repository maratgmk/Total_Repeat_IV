package org.example.task_of_list.task2;

import com.sun.jdi.connect.spi.Connection;

import java.util.*;

/*
 * 2 Напишите метод, который принимает два списка, сортирует их, объединяет в один и записывает элементы в обратном порядке.
 * Используйте методы интерфейса List и класс Collections.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(56, 12, 71, 8, -23, -11, 7, 172, -11);
        List<Integer> integers1 = new ArrayList<>(integers);
        List<Integer> integers2 = new ArrayList<>();
        Collections.addAll(integers2, -1, 4, 7, -23, 37, 51, 0, -13);

        System.out.println(getUnionReverse(integers1, integers2));

        List<String> strings1 = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        Collections.addAll(strings1,"Bone","One","Forth","Twenty");
        Collections.addAll(strings2,"Green","Blue","Ace","Yellow");

        System.out.println(getUnionReverseII(strings1, strings2));


    }
    public static List<Integer> getUnionReverse(List<Integer> integers,List<Integer> numbers){
        List<Integer> union = new ArrayList<>();
        Collections.sort(integers);
        System.out.println(integers);
        Collections.sort(numbers);
        System.out.println(numbers);
        for (Integer integer : integers) {
            Collections.addAll(union,integer);
        }
        for (Integer integer : numbers) {
            Collections.addAll(union,integer);
        }
        Collections.sort(union);
        Collections.reverse(union);
        return union;
    }
    public static List<String> getUnionReverseII(List<String> strings1,List<String> strings2){
        List<String> union = new ArrayList<>();
        Collections.sort(strings1);
        System.out.println(strings1);
        Collections.sort(strings2);
        System.out.println(strings2);
        for (String string : strings1) {
            Collections.addAll(union,string);
        }
        for (String string : strings2) {
            Collections.addAll(union,string);
        }
        Collections.sort(union);
        Collections.reverse(union);
        return union;
    }

}
