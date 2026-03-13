import java.util.*;
import java.util.stream.Collectors;

public class PracticeQuestions {
    static void main() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        //get all even numbers
        List<Integer> list = numbers.stream().filter(i -> i%2==0).toList();
        System.out.println(list);


        //get squares of all numbers
        List<Integer> list1 = numbers.stream().map(i -> i*i).toList();
        System.out.println(list1);


        //Get numbers greater than 5
        List<Integer> list2 = numbers.stream().filter(i -> i>5).toList();
        System.out.println(list2);


        //Count how many numbers are odd
        Long list3 = numbers.stream().filter(i -> i%2!=0).count();
        System.out.println(list3);


        //Find the maximum number
        Optional<Integer> list4 = numbers.stream().max(Integer::compare);
        System.out.println(list4);


        //Multiply every number by 2
        List<Integer> list5 = numbers.stream().map(i->i*2).toList();
        System.out.println(list5);


        //Count how many numbers are divisible by 3
        List<Integer> list6 = numbers.stream().filter(i->i%3==0).toList();
        System.out.println(list6);


        //Find the maximum number
        Optional<?> list7 = numbers.stream().max(Integer::compare);
        System.out.println(list7);


        //Calculate average of numbers
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println(average);


        //Check if any number is greater than 8
        Boolean check = numbers.stream().anyMatch(i->i>8);
        System.out.println(check);


        //                  List of Strings

        List<String> names = List.of("Ali", "Ahmed", "Aqib", "Sara", "Amna", "Bilal");

        //Convert all names to uppercase
        List<String> list8 = names.stream().map(String::toUpperCase).toList();
        System.out.println(list8);


        //Get names starting with letter "A"
        List<String> list9 = names.stream().filter(i-> i.startsWith("A")).toList();
        System.out.println(list9);


        //Count names whose length is greater than 4
        List<String> list10 = names.stream().filter(i-> i.length()>4).toList();
        System.out.println(list10);


        //Sort names alphabetically
        List<String> list11 = names.stream().sorted().toList();
        System.out.println(list11);


        //Sort names by length
        List<String> list12 = names.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(list12);


        //Get first name starting with "S"
        String list13 = names.stream().filter(i->i.startsWith("S")).findFirst().toString();
        System.out.println(list13);


    }
}
