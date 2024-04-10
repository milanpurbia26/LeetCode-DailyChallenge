import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCard {
    public static void main(String[] args) {
        int deck[] ={17,13,11,2,3,5,7};
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList();
        for(int i =0;i<deck.length;i++)
        {
            queue.add(i);
        }
        int [] ans = new int[deck.length];
        int ptr=0;
        while(!queue.isEmpty())
        {
            int index = queue.poll();

            if(!queue.isEmpty())
            {
                queue.offer(queue.poll());
            }
            ans[index] = deck[ptr];
            ptr+=1;
        }

        System.out.println(Arrays.toString(ans));
    }
}
