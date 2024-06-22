package java1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.*;

public class Main1 {
    static HashSet<Double> rates = new HashSet<Double>();

    public static void main(String[] args) {
        arrayList();
        System.out.println("\n");
        linkedList();
        System.out.println("\n");
        sets();
        System.out.println("\n");
        queues();
        System.out.println("\n");
        maps();
    }

    public static void arrayList(){
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("ARRAYLISTS");

        // Adding elements
        names.add("Emily");
        names.add("Kyle");
        names.add("Oscar");
        names.add("Mary");
        names.add("Steve");
        System.out.println("Add names to empty ArrayList: " + names);

        // Removing elements
        names.remove("Oscar");
        System.out.println("Remove 'Oscar': " + names);

        // Retrieving elements at a specific index position
        System.out.println("Retrieve name at index 2: " + names.get(2) + " lies at index " + names.indexOf(names.get(2)));

        // Change Item
        names.set(2, "John");
        System.out.println("Change name at index to " + names.get(2) + ": " + names);

        // Get Size
        System.out.print("Get Array Size: " + names.size());
    }

    public static void linkedList(){
        LinkedList<Integer> integers = new LinkedList<Integer>();
        System.out.println("LINKEDLISTS");

        // Adding elements
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println("Add integers to empty LinkedList: " + integers);

        // Add to front and back
        integers.addFirst(0);
        integers.addLast(4);
        System.out.println("Add 0 to the front and 4 to the back: " + integers);

        // Get front and last position
        System.out.println("Retrieving first integer, " + integers.getFirst() + ", and last integer, " + integers.getLast() + ".");

        // Remove first and last integers
        integers.removeLast();
        integers.removeFirst();
        System.out.println("Remove first and last integers: " + integers + ".");

        // Descending Iteration
        Iterator it = integers.descendingIterator();
        System.out.print("Descending iteration: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

    public static void sets(){
        System.out.println("SETS (HashSet)");

        // Add elements
        rates.add(0.1);
        rates.add(0.4);
        rates.add(0.9);
        rates.add(0.7);
        rates.add(0.15);
        System.out.println("Add doubles to empty set: " + rates);

        // Check if item exists in set
        System.out.println("Check if set contains a value of 0.5: " + rates.contains(0.5));
        System.out.println("Check if set contains a value of 0.7: " + rates.contains(0.7));

        // Get size of set
        System.out.println("Get size of set: " + rates.size());

        // Remove all elements
        rates.clear();
        System.out.println("Remove all elements: " + rates);

        // Check if empty
        System.out.print("Check if empty: " + rates.isEmpty());
    }

    public static void queues(){
        PriorityQueue<String> sports = new PriorityQueue<String>();
        System.out.println("QUEUES (PriorityQueue)");

        // Add
        sports.add("Soccer");
        sports.add("Hockey");
        sports.add("Volleyball");
        sports.add("Ultimate Frisbee");
        System.out.println("Elements: " + sports);

        // Insert elements
        sports.offer("Badminton");
        sports.offer("Baseball");
        System.out.println("Insert new elements: " + sports);

        // Retrieve head of queue
        System.out.println("Retrieve queue head: " + sports.peek() + "; ");
        System.out.println(sports);
        System.out.println("Retrieve queue head and remove it: " + sports.poll());
        System.out.println(sports);

        // Get size
        System.out.println("Get size: " + sports.size());

        //Remove all
        sports.clear();
        System.out.print("Remove all elements: " + sports);
    }

    public static void maps(){
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        System.out.println("MAPS (TreeMap)");
        // Create/Put
        map.put("Red", 1);
        map.put("Orange", 2);
        map.put("Yellow", 3);
        map.put("Green", 4);
        map.put("Blue", 5);
        map.put("Indigo", 6);
        map.put("Violet", 7);
        System.out.println(map);

        // Search for key
        System.out.println("Search for 'White' key: " + map.containsKey("White"));
        System.out.println("Search for 'Blue' key: " + map.containsKey("White"));

        // Search for value
        System.out.println("Search for value 3: " + map.containsValue(3));
        System.out.println("Search for value 12: " + map.containsValue(12));

        // Get greatest and least key
        System.out.println("Greatest key: " + map.firstKey());
        System.out.println("Least key: " + map.lastKey());

        // Descending Map
        System.out.println(map.descendingMap());
    }
}