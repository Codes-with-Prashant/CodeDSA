class Solution {
    
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
       
        int la=maxDepth(root.left);
        int ra=maxDepth(root.right);
        
        return Math.max(la,ra)+1;
    }
}