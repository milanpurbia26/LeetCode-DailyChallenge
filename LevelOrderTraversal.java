public class LevelOrderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>>ans = new ArrayList();
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) return ans;
            queue.offer(root);
            while(!queue.isEmpty())
            {
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>();
                for(int i =0;i<levelSize;i++)
                {
                    TreeNode current = queue.poll();
                    currentLevel.add(current.val);
                    if(current.left!=null)
                        queue.offer(current.left);
                    if(current.right!=null)
                        queue.offer(current.right);
                }
                ans.add(currentLevel);
            }
            return ans;
        }
    }
}
