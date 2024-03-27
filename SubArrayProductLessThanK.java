public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums ={10,5,2,6};
        int k =100;
        int left = 0;
        int product = 1;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product /= nums[left];
                left++;
            }
            result += right - left + 1;
        }
        System.out.println(result);
    }
}
