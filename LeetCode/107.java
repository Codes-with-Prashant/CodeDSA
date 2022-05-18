class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<List> stk = new Stack<>();
        queue.add(root);
        while (queue.size() > 0) {
            List<Integer> ansc = new ArrayList<>();
            int lsize = queue.size();
            for (int i = 0; i < lsize; i++) {
                TreeNode temp = queue.remove();

                ansc.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            stk.push(ansc);
        }
        while(stk.size()>0){
            ans.add(stk.pop());
        }
        return ans;
    }
}
