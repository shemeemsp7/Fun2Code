import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        
    }

    public static boolean isValid(String s){
        char[] arr= s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c : arr){
            if(c=='(' || c=='[' ||c=='{' ){
                stack.push(c);
            }

            if(stack.isEmpty()){
                return false;
            }

            if(c==')' && !stack.isEmpty() && stack.pop()!='('){
                return false;
            }else if(c==']' && !stack.isEmpty() && stack.pop()!='['){
                return false;
            }
            else if(c=='}' && !stack.isEmpty() && stack.pop()!='{'){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
