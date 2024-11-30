package javaLanguage.stackQuestions;

public class InsertAnElementAtBottom {
    public static void main(String[] args) {


    }

    public static Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x) {
        insertAtBottom(myStack, x);

        return myStack;
    }

    public static void insertAtBottom(Stack<Integer> myStack, int x) {
        // base code
        if (myStack.size == 0) {
            myStack.push(x);
            return;
        }

        int topItem = myStack.pop();
        insertAtBottom(myStack, x);
        myStack.push(topItem);
    }


}

