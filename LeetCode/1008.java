class Solution {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,  Integer.MAX_VALUE);
    }
    
    public TreeNode construct(int[] pre,  int max){
        if(index == pre.length){
            return null;
        } else if(pre[index] < max){
            TreeNode node = new TreeNode();
            
            node.val = pre[index];
            index++;
            
            node.left = construct(pre,  node.val);
            node.right = construct(pre,  max);
            
            return node;
        } else {
            return null;
        }
    }
    
}