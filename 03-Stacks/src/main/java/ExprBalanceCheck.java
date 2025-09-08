import java.util.Scanner;

public class ExprBalanceCheck {
    public static void main(String[] args) {
        System.out.println("Enter an Expression: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        System.out.println(balanceCheck(expression));
        
    }
    public static boolean balanceCheck(String expr){
        MyStack<Character> myStack = new MyStack<>();
        for (int i = 0; i < expr.length(); i++) {
            Character c = expr.charAt(i);
            if(c != '(' && c != '[' && c != '{' && c != ')' && c != '}' && c !=']') continue;
            if (c == '(' || c == '{' || c == '['){
                // push opening symbol to stack
                myStack.push(c);
                continue;
            }

            // At this point c is a closing symbol
            // Stack shouldn't be empty
            if(myStack.isEmpty())return false;

            char match;
            switch (c){
                case ')':
                { match = myStack.pop();
                    if (match != '(') return false;}
                case ']':
                { match = myStack.pop();
                    if(match != '[') return false;}
                case '}':
                {  match = myStack.pop();
                    if(match != '{') return false;}
            }

        }
        return myStack.isEmpty();
    }
}
