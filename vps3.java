import java.util.Stack;

public class vps3 {
    public static void main(String[] args) {
        String s = "*(";
        Stack<Integer>bracket = new Stack<>();
        Stack<Integer>asterick = new Stack<>();

        for(int i =0;i<s.length();i++)
        {
            if (s.charAt(i) =='(')
                bracket.push(i);
            else if (s.charAt(i) == '*')
                asterick.push(i);
            else if (!bracket.isEmpty()) {
                bracket.pop();
            } else if (!asterick.isEmpty()) {
                asterick.pop();
            }
        }
        if(! bracket.isEmpty()  && !asterick.isEmpty() && bracket.peek() < asterick.peek())
        {
            bracket.pop();
            asterick.pop();
        }

        System.out.println( bracket.isEmpty());

    }
}
