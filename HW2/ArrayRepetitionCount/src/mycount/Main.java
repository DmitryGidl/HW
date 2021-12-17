package mycount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>( Arrays. asList(4,5,-6,4,5,3,4,2,4,5,7) );
        Map<Integer, Integer> numberRepetitionCount = new HashMap<>();
        for(Integer i : integers) {
            int count = Collections.frequency(integers, i);
            numberRepetitionCount.put(i, count);
        }

        System.out.println("Original Array " + integers);
        System.out.println("Number-Repetition count map " + numberRepetitionCount);
    }
}
