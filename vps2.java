import java.util.HashSet;
import java.util.Stack;

public class vps2 {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        Stack<Integer>st = new Stack<>();
        HashSet<Integer>removeIndices = new HashSet<>();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                st.push(i);
            }else if(s.charAt(i) == ')')
            {
                if(!st.empty())
                    st.pop();
                else
                    removeIndices.add(i);
            }
        }
        while(!st.empty())
            removeIndices.add(st.pop());

        StringBuilder result = new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            if(!removeIndices.contains(i))
                result.append(s.charAt(i));
        }
        System.out.println(result);
    }
}
