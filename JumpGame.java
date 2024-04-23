class Solution {
    public boolean canJump(int[] nums) {
      int maxReach = nums[0];
for (int i = 0; i <= maxReach; i++) {
    maxReach = Math.max(maxReach, i + nums[i]); 
    if (maxReach >= nums.length - 1) {
        return true;
}
return false; 
    }
}
