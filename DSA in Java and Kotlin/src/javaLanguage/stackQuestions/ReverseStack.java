package javaLanguage.stackQuestions;

public class ReverseStack {
    public static void main(String[] args) {

    }

    public static void reverseStack(Stack<Integer> stack) {
        // write your code here

        if (stack.size == 0) return;

        int topElement = stack.pop();

        reverseStack(stack);

        InsertAnElementAtBottom.insertAtBottom(stack, topElement);
    }


}
