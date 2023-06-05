package chap13_generic.problems.prob04;

public class Util {
    public static <K, V> V getValue(Pair<K, V> p1, K k){
        if(p1.getKey() == k) return p1.getValue();
        else return null;
    }
}
