class Solution {
    public List<Integer> ans = new ArrayList<>();

    public void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);

        postorder(root.right);

        ans.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        postorder(root);
        return ans;
    }
}
