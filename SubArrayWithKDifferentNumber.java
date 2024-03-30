import java.util.HashMap;

public class SubArrayWithKDifferentNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int ans = atmostk(nums, k)-atmostk(nums,k-1);
        System.out.println(ans);
    }

    public static int atmostk(int nums[], int k) {
        int i = 0, j = 0, ans = 0;
        HashMap<Integer, Integer> myData = new HashMap<>();
        while (j < nums.length) {

            myData.put(nums[j], myData.getOrDefault(nums[j], 0) + 1);


            while (myData.size() > k && i <= j) {
                myData.getOrDefault(nums[i], 0);
                int count = myData.getOrDefault(nums[i], 0);
                if (count > 0) {
                    myData.put(nums[i], count - 1);
                }
                if (myData.get(nums[i]) == 0)
                    myData.remove(nums[i]);
                i++;
            }
            ans += (j - i + 1);
            j++;
        }
        return ans;
    }
}

