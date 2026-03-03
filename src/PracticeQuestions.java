import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
//        Optional<?> list7 = numbers.stream().(Integer::compare);
//        System.out.println(list7);
    }
}
