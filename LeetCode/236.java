class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
           if(root == null){	
	        return null;
	    }
	    
	    TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);
	    
	    if(root.val == p.val){

	        return root;
	    } else if(root.val == q.val){
	     
	        return root;
	    } else if(left != null && right != null){
	        return root;
	    } else if(left!= null){
	        return left;
	    } else if(right != null){
	        return right;
	    } else {
	        return null;
	    }
    }
}