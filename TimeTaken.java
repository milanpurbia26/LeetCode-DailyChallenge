public class TimeTaken {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0, timeTaken = 0;
        while (tickets[k] >= 1) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0)
                    break;

                if (tickets[i] >= 1) {
                    tickets[i] -= 1;
                    timeTaken += 1;
                }
            }
        }
        System.out.println("Time taken for kth person finish buying ticket " + timeTaken);
    }
}
