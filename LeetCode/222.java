class Solution {
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
    TreeNode node= root.left;
        
        int lh=0;
        while(node!=null){
            node=node.left;
            lh++;
        }
        
        int rh=0;
        node=root.right;
        while(node!=null)
        {node=node.right;
        rh++;}
        if(lh==rh)
        {int ht=lh+1;
        return (1<<ht)-1;}
        else{return countNodes(root.left)+ countNodes(root.right)+1;}
        
    }
}