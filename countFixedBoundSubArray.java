public class countFixedBoundSubArray {
    public static void main(String[] args) {
        int nums[] ={1,3,5,2,7,5};
        int minK=1,maxK=5;
        int minB=-1,maxB=-1,badB=-1;
        long count=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>maxK || nums[i]<minK)
                badB=i;
            if(nums[i] == maxK)
                maxB=i;
            if(nums[i] == minK)
                minB = i;

            count+=Math.max(0,Math.min(minB,maxB)-badB);
        }
        System.out.println("Count of fixed bound subArray " + count);
    }
}
