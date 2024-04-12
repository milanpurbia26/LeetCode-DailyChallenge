public class TrapWater {
    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("the Amount of water is traped is " +trap(height));
    }

    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(height[i],left[i - 1]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int j = right.length - 2; j >= 0; j--) {
            right[j] = Math.max(height[j], right[j + 1]);
        }
        int ans = 0;
        for (int k = 0; k < height.length; k++) {
            ans += Math.min(left[k], right[k]) - height[k];
        }

        return ans;
    }
}
