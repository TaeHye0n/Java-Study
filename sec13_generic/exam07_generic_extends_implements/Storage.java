package sec13_generic.exam07_generic_extends_implements;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}