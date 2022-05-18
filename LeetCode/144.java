class Solution {
    public List<Integer> ans = new ArrayList<>();

    public void preorder(TreeNode root) {
        if (root == null) return;
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        preorder(root);
        return ans;
    }
}
