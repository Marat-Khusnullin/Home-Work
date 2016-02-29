package ru.itis.inform;


public interface Iterator<T> {
  //  boolean hasPrev();
    boolean hasNext();
    T next();
    T previous();
    T pickNext();
    T pickPrevious();
    void back();
    void insert(T element);
}
