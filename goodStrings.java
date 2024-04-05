import java.util.Stack;

public class goodStrings {
    public static void main(String[] args) {
        String s  = "leEeetcode";
        Stack<Character> stack1 = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(stack1.isEmpty()) {
                stack1.push(s.charAt(i));
            } else {
                if(Math.abs(stack1.peek() - s.charAt(i)) == 32) {
                    stack1.pop();
                } else {
                    stack1.push(s.charAt(i));
                }
            }
        }
       StringBuilder ans = new StringBuilder();
        while (!stack1.isEmpty()) {
            ans.append(stack1.pop());
        }

       s =  ans.reverse().toString();
        System.out.println(s);
    }
}
