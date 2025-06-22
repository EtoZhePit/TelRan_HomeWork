package telran.pattern.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAppl {
    public static void main(String[] args) {
        String str = "Mama, mula ramu! Mama, mula ramy?";

        String regex = "[Mm]ama"; // ^ -> С начала строки
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str); // сравниваем с примером
        //  System.out.println(matcher.matches()); // matches - строгое соответствие
        System.out.println("Find: " + matcher.find()); // ищет совпадение
        System.out.println("Start: " + matcher.start()); // индекс начала
        System.out.println("Group: " + matcher.group()); // в какой группе
        System.out.println("End = " + matcher.end()); // индекс в конце
        System.out.println("================== #2 ====================" );
        System.out.println("Find: " + matcher.find()); // ищет совпадение
        System.out.println("Start: " + matcher.start()); // индекс начала
        System.out.println("Group: " + matcher.group()); // в какой группе
        System.out.println("End = " + matcher.end()); // индекс в конце
        System.out.println("-------------Reset-------------");
        matcher.reset("Mama mula ramy, mama Mama");
        while (matcher.find()){
            System.out.println("Start: " + matcher.start()); // индекс начала
            System.out.println("Group: " + matcher.group()); // в какой группе
            System.out.println("End = " + matcher.end()); // индекс в конце
        }


    }
}
