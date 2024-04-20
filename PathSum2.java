class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        findAllPaths(root, 0, targetSum, new ArrayList<>(), ans);
        return ans;
    }

    private void findAllPaths(TreeNode root, int currentSum, int targetSum, List<Integer> currentAns, List<List<Integer>> ans) {
        if (root == null) return;

        currentSum += root.val;
        currentAns.add(root.val);

        if (root.left == null && root.right == null && currentSum == targetSum) {
            ans.add(new ArrayList<>(currentAns));
        }

        findAllPaths(root.left, currentSum, targetSum, currentAns, ans);
        findAllPaths(root.right, currentSum, targetSum, currentAns, ans);

        currentAns.remove(currentAns.size() - 1);
    }
}
