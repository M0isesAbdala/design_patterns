package interator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}