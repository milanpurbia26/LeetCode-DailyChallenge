class node {
    int val;
    node left;
    node right;

    node() {
    }

    node(int val) {
        this.val = val;
    }

    node(int val, node left, node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class PathSum {
    public boolean hasPathSum(node root, int targetSum) {
        if (root == null) {
            return false;
        }
        return findPathsum(root, targetSum, 0);
    }

    private boolean findPathsum(node node, int targetSum, int currentSum) {
        if (node == null) {
            return false;
        }

        currentSum += node.val;

        if (node.left == null && node.right == null && currentSum == targetSum) {
            return true;
        }

        return findPathsum(node.left, targetSum, currentSum) || findPathsum(node.right, targetSum, currentSum);
    }

    public static void main(String[] args) {
        node root = new node(5);
        root.left = new node(4);
        root.right = new node(8);
        root.left.left = new node(11);
        root.left.left.left = new node(7);
        root.left.left.right = new node(2);
        root.right.left = new node(13);
        root.right.right = new node(4);
        root.right.right.right = new node(1);

        int targetSum = 22;

        PathSum solution = new PathSum();
        boolean pathExists = solution.hasPathSum(root, targetSum);

        if (pathExists) {
            System.out.println("path exist in tree" + targetSum);
        } else {
            System.out.println("No path with sum " + targetSum);
        }
    }
}
