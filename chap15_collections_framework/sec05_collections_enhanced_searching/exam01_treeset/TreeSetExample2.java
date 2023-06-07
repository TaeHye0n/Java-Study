package chap15_collections_framework.sec05_collections_enhanced_searching.exam01_treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for(Integer score : ascendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = scores.descendingIterator();
        while(iterator.hasNext()){
            int score = iterator.next();
            System.out.print(score + " ");
        }
        System.out.println();

        Iterator<Integer> iterator2 = descendingSet.iterator();
        while(iterator2.hasNext()){
            int score = iterator2.next();
            System.out.print(score + " ");
        }
    }
}
