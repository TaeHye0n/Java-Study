package chap15_collections_framework.sec05_collections_enhanced_searching.exam04_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        /*
        TreeSet<Fruit> treeSet = new TreeSet<>();
        //Fruit이 Comparable을 구현하지 않았기 때문에 ClassCastException 발생
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
         */

        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }

        TreeSet<Fruit> treeSet2 = new TreeSet<>((o1, o2) -> o2.price - o1.price);
        treeSet2.add(new Fruit("포도", 3000));
        treeSet2.add(new Fruit("수박", 10000));
        treeSet2.add(new Fruit("딸기", 6000));
        Iterator<Fruit> iterator2 = treeSet2.iterator();
        while(iterator2.hasNext()){
            Fruit fruit = iterator2.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}