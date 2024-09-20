package org.example.task_of_list.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//* 1 Дан список строк. Отфильтруйте список так, чтобы в нём остались только те строки, которые содержат адреса электронной почты.
public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("green","blue","yellow@green.com","red@black.org","pink","@pink","pink@","pi@nk","brown.wight@nothing.else.com");
        System.out.println(list);
        String regex = "[\\w.]+@[\\w.]+\\.\\w+";
        List<String> emails = getEmails2(list,regex);
        System.out.println(emails);


    }

    public static List<String> getEmails2(List<String> list, String regex){
        List<String> emails = new ArrayList<>();
        for (String string : list) {
            if(string.matches(regex)){
                emails.add(string);
            }
        }
        return emails;
    }
}
