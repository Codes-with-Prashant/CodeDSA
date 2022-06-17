class Solution {
    int count = 0;
    final int CAMERA = 1;
    final int MONITORED = 2;
    final int NOTMONITORED = 3;

    public int minCameraCover(TreeNode root) {
        int val = helper(root);
        if (val == NOTMONITORED) count++;
        return count;
    }

    public int helper(TreeNode node) {
        if (node == null) return MONITORED;
        int left = helper(node.left);
        int right = helper(node.right);

        if (left == NOTMONITORED || right == NOTMONITORED) {
            count++;
            return CAMERA;
        } else if (left == CAMERA || right == CAMERA) return MONITORED; 
        else return NOTMONITORED;
    }
}
