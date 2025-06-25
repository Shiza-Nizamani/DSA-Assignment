package DSAassignment;
import java.util.Scanner;
import java.util.Stack;
public class ParenthesesMatcher {
    // helper method to check for matching brakets
    private static boolean isMatching(char open, char close){
        return (open == '(' && close == ')')||
                (open == '{' && close == '}')||
                (open == '[' && close == ']');
    }
    // main logic
    public static boolean areParenthesesBalanced(String expr){
        Stack<Character> stack = new Stack<>();
        for(char ch: expr.toCharArray()){
            if(ch == '(' || ch == '{'|| ch == '['){
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty() || !isMatching(stack.pop(),ch)){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with parentheses to check: ");
        String input = sc.nextLine();
        if(areParenthesesBalanced(input)){
            System.out.println("Parentheses are balanced ");
        }else {
            System.out.println("Parentheses are not balanced  ");
        }
    }
}
/* SAMPLE OUTPUT
    Enter a string with parentheses to check: 
{(hello world)}
Parentheses are balanced 

Process finished with exit code 0*/
/* SAMPLE OUTPUT 
    Enter a string with parentheses to check: 
{{(hello world}}})
Parentheses are not balanced  

Process finished with exit code 0 */
