import java.util.Arrays;

class firstMissingPositive {

    public static void main(String[] args) {
        //smallest positive number is 1
        int nums[] = {0, 1, 2};
        int smallestPositive = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == smallestPositive) {
                smallestPositive += 1;
            } else if (nums[i] > smallestPositive) {
                break;
            }

        }
        System.out.println(smallestPositive);
    }

}





