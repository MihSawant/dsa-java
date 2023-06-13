package tutedude_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
    Mihir Sawant, MCA NMIMS University,
    Open Source, Data Engineering, System Design
 */
public class ListExample {


    public static void main(String[] args) {
        // LIST -> collection of some objects, list, built on top of an array
        // dynamic in nature
        // elements of similar data types, duplicate elements

        List<Integer> numbers = new ArrayList<>(5);
        // adding item into a list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        numbers.add(60);
        numbers.add(65);
        System.out.println(numbers);

        // remove item from list
        numbers.remove(0);
        System.out.println("removed 10: "+numbers);
        numbers.remove(3);
        System.out.println("removed 50: "+numbers);

        System.out.println("size: "+numbers.size());

        int number = numbers.get(2);
        System.out.println("Getting a number: "+number);

        // check if exists
        boolean result = numbers.contains(1000);
        System.out.println("has item: "+result);

        // clear the collection
        numbers.clear();
        System.out.println("Is empty: "+numbers.isEmpty());

        // elements      index
        numbers.add(1);  // 0
        numbers.add(2);  // 1
        numbers.add(3);  // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        System.out.println("before set: "+numbers);
        numbers.set(2, 300);
        System.out.println("after set: "+numbers);

        numbers.clear();
        // adding in random order i.e not ordered
        numbers.add(78);
        numbers.add(10);
        numbers.add(56);
        numbers.add(2);
        numbers.add(45);
        numbers.add(71);
        numbers.add(12);
        System.out.println("Random order: "+numbers);


        // Functional Programming
        // sort
        // lambda expression
        numbers.sort((a, b) ->{
            if(a < b) {
                return -1;
            } else if(a > b){
                return 1;
            }
            return 0;
        });
        // method reference
        numbers.sort(Integer::compareTo);

        // java 17, java 11 +
        List<Integer> listSorted = numbers.stream().sorted().toList();
        System.out.println("Sorted order: "+listSorted);

        numbers.add(1, 11);
        System.out.println("added 11: "+numbers);

        numbers.addAll(List.of(7, 8, 10, 222));
        System.out.println(numbers);



    }



}
