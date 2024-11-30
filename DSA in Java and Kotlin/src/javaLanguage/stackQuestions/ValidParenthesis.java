package javaLanguage.stackQuestions;

public class ValidParenthesis {
    public static void main(String[] args) {

    }

    public static boolean isValidParenthesis(String s) {
        Stack<Character> parenthesis = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            //opening bracket - push
            //close bracket  - pop

            if (ch == '(' || ch == '{' || ch == '[') {
                parenthesis.push(s.charAt(i));
            } else {
                if (parenthesis.size > 0) {
                    char topChar = parenthesis.peek();
                    if (ch == ')' && topChar == '(' ||
                            ch == '}' && topChar == '{' ||
                            ch == ']' && topChar == '['
                    ) {
                        parenthesis.pop();
                    } else return false;

                } else return false;
            }
        }


        return parenthesis.size == 0;
    }
}
