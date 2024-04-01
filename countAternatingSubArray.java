public class countAternatingSubArray {
    public static void main(String[] args) {
        int [] nums = {0,1,1,1};
        long ans=0;
        int latestOccurance =-1;
        for(int i =0;i<nums.length;i++)
        {
            if( i>0 && nums[i] == nums[i-1] )
                latestOccurance = i-1;

            ans+=i-latestOccurance;
        }
        System.out.println("no of  alterating subarray are " + ans);
    }
}
