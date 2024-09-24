package javaLanguage.stackQuestions;


import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> arr;
    int size = 0;
    int top;

    public Stack() {
        arr = new ArrayList<>();
        top = -1;
    }

    public Stack(int size) {
        this.size = size;
        arr = new ArrayList<>(size);
        top = -1;
    }

    public T peek() {
        if (top >= 0) return arr.get(top);
        return null;
    }

    public void push(T element) {
        if (size - top >= 1) {
            arr.add(element);
            size++; top++;
        } else throw new IllegalStateException("Size overflow");
    }

    public T pop() {
        if (size <= 0) {
            throw new IllegalStateException("Size overflow");
        } else {
            top--;
            return arr.remove(--size);
        }
    }

}


