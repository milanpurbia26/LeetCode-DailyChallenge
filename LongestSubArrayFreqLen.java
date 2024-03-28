import java.util.HashMap;

public class LongestSubArrayFreqLen {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,3,1,2};
        int start=0,max=0,k=2;
        HashMap<Integer, Integer> mapData = new HashMap<>();
        for(int end=0;end<nums.length;end++){
            mapData.put(nums[end],mapData.getOrDefault(nums[end],0)+1);
            while(mapData.get(nums[end])>k && start <=end){

                mapData.put(nums[start],mapData.get(nums[start])-1);
                start++;
            }
            max=Math.max(max,end-start+1);
        }
        if(max==0){
            System.out.println("max length is length of array" + max);
        }

        System.out.println("length of longest subarray with k freq is " + max);
    }
}
