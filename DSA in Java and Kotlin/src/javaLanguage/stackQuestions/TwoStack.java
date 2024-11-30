package javaLanguage.stackQuestions;

import java.util.ArrayList;

public class TwoStack {

    // Initialize TwoStack.
    int size, top1, top2;
    int[] arr;

    public TwoStack(int s) {
        // Write your code here
        size = s;
        top1 = 0;
        top2 = size - 1;
        arr = new int[size];

    }

    // Push in stack 1.
    public void push1(int num) {
        // Write your code here

        if ((size -1 - top2) + top1 <= size - 1){
            arr[top1++] = num;
        }
    }

    // Push in stack 2.
    public void push2(int num) {
        if ((size - 1 - top2) + top1 <= size - 1){
            arr[top2--] = num;
        }
    }

    // Pop from stack 1 and return popped element.
    public int pop1() {
        return arr[top1--];
    }

    // Pop from stack 2 and return popped element.
    public int pop2() {
        return  arr[top2++];
    }

}
