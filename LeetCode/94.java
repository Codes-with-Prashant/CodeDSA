class Solution {
    public  List<Integer> ans = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return  Collections.emptyList();
        inorder(root);
        return ans;
    }
}