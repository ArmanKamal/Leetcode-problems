import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(is_balanced("({})"));
        System.out.println(is_balanced("(abc})"));

    
      }

    static boolean is_balanced(String s){
            Stack<Character> stack = new Stack<>();

            for(int i=0;i<s.length();i++){
                Character c = s.charAt(i);

                if(c == '(' || c == '{' || c=='['){
                    stack.push(c);
                }
                else if(c == ')' || c=='}'|| c==']'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    Character pop_value = stack.pop();

                    if(c == ')' && pop_value != '('){
                        return false;
                    }
                    else if(c == '}' && pop_value != '{'){
                        return false;
                    }
                    else if(c == ']' && pop_value != '['){
                        return false;
                    }
                }
            }

            return stack.size() == 0;
    }



}
