import java.util.Stack;

public class RemoveKDigit {
    public static void main(String[] args) {
        String  num = "1432219";
                int k = 3;
          String ans = RemoveKDigits(num,k);
        System.out.println(" after removing K digit " + ans);
    }

    private static String RemoveKDigits(String num,int k) {
        if(num.length() ==0)
            return "0";
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray())
        {
            while (!st.isEmpty() && k>0 && st.peek() > ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while(!st.isEmpty())
        {
            result.insert(0,st.pop());
        }
        while(result.length() >0 && result.charAt(0) == '0')
        result.deleteCharAt(0);
        
        return result.length() == 0 ? "0" : result.toString();
    }
}
