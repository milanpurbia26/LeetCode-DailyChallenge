public class countSubArray {
    public static void main(String[] args) {
        int [] nums = {1,3,2,3,3};
        int k =2;
        int i =0,j=0,freq=0,max=0;
        long res=0;
        for(int num :nums)
        {
            max = Math.max(max,num);
        }

        while(j<nums.length)
        {
            if(nums[j] == max)
                freq++;

            while(freq >=k)
            {
                res+=nums.length-j;
                if(nums[i]==max)
                    freq--;
                i++;
            }
            j++;

        }
        System.out.println("count subarray of max element" + res);
    }
    }

