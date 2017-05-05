package Module7.Task75;

import java.util.*;

public class TimeChecker {
    static List<Integer> arrayListInts = new ArrayList<>();
    static List<Integer> linkedListInts = new LinkedList<>();
    static List<String> arrayListStrings = new ArrayList<>();
    static List<String> linkedListStrings = new LinkedList<>();
    static void measureTime(int size){
        // add
        long startTime = System.nanoTime();
        arrayListInts.add(25);
        long endTime = System.nanoTime();
        System.out.println("Add to ArrayList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        linkedListInts.add(25);
        endTime = System.nanoTime();
        System.out.println("Add to LinkedList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        arrayListStrings.add("hello");
        endTime = System.nanoTime();
        System.out.println(("Add to ArrayList of " + size + " strings, time: " + (endTime - startTime)));
        startTime = System.nanoTime();
        linkedListStrings.add("hello");
        endTime = System.nanoTime();
        System.out.println("Add to LinkedList of " + size + " strings, time: " + (endTime - startTime));
        // set
        startTime = System.nanoTime();
        arrayListInts.set(500, 5);
        endTime = System.nanoTime();
        System.out.println("Set in ArrayList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        linkedListInts.set(500, 5);
        endTime = System.nanoTime();
        System.out.println("Set in LinkedList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        arrayListStrings.set(500, "hello");
        endTime = System.nanoTime();
        System.out.println(("Set in ArrayList of " + size + " strings, time: " + (endTime - startTime)));
        startTime = System.nanoTime();
        linkedListStrings.set(500, "hello");
        endTime = System.nanoTime();
        System.out.println("Set in LinkedList of " + size + " strings, time: " + (endTime - startTime));
        // get
        startTime = System.nanoTime();
        arrayListInts.get(500);
        endTime = System.nanoTime();
        System.out.println("Get in ArrayList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        linkedListInts.get(500);
        endTime = System.nanoTime();
        System.out.println("Get in LinkedList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        arrayListStrings.get(500);
        endTime = System.nanoTime();
        System.out.println(("Get in ArrayList of " + size + " strings, time: " + (endTime - startTime)));
        startTime = System.nanoTime();
        linkedListStrings.get(500);
        endTime = System.nanoTime();
        System.out.println("Get in LinkedList of " + size + " strings, time: " + (endTime - startTime));
        // remove
        startTime = System.nanoTime();
        arrayListInts.remove(500);
        endTime = System.nanoTime();
        System.out.println("Remove in ArrayList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        linkedListInts.remove(500);
        endTime = System.nanoTime();
        System.out.println("Remove in LinkedList of " + size + " ints, time: " + (endTime - startTime));
        startTime = System.nanoTime();
        arrayListStrings.remove(500);
        endTime = System.nanoTime();
        System.out.println(("Remove in ArrayList of " + size + " strings, time: " + (endTime - startTime)));
        startTime = System.nanoTime();
        linkedListStrings.remove(500);
        endTime = System.nanoTime();
        System.out.println("Remove in LinkedList of " + size + " strings, time: " + (endTime - startTime));
    }
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            arrayListInts.add(rand.nextInt());
            linkedListInts.add(rand.nextInt());
            arrayListStrings.add(Character.toString((char)('A' + rand.nextInt(52))));
            linkedListStrings.add(Character.toString((char)('A' + rand.nextInt(52))));
        }
        measureTime(1000);
        arrayListInts.clear();
        linkedListInts.clear();
        arrayListStrings.clear();
        linkedListInts.clear();
        for (int i = 0; i < 10000; i++) {
            arrayListInts.add(rand.nextInt());
            linkedListInts.add(rand.nextInt());
            arrayListStrings.add(Character.toString((char)('A' + rand.nextInt(52))));
            linkedListStrings.add(Character.toString((char)('A' + rand.nextInt(52))));
        }
        measureTime(10000);
    }
}
