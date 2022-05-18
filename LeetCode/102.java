class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return Collections.emptyList();
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        queue.add(root);
        while(queue.size()>0){
            List<Integer> ansc=new ArrayList<>();
            int lsize=queue.size();
            for(int i=0;i<lsize;i++){
            TreeNode temp= queue.remove();
          
            ansc.add(temp.val);
            if(temp.left!=null){queue.add(temp.left);}
            if(temp.right!=null){queue.add(temp.right);}
            
            }
            ans.add(ansc);
        }return ans;
    }
}