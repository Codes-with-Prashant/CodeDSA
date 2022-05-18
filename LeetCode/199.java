*/
class Solution {
    public List<Integer> rightSideView(TreeNode root) 
    {List<Integer> retVal = new ArrayList<>();
    if(root==null){return retVal;}
    Queue<TreeNode> queue= new LinkedList<>();
    queue.add(root);
    while(queue.size()>0)
    {
        int lsize=queue.size();
        for(int i =0; i<lsize;i++)
        {TreeNode temp= queue.remove();
            if(i==lsize-1)
            {retVal.add(temp.val);}
            if(temp.left!=null){queue.add(temp.left);}
            if(temp.right!=null){queue.add(temp.right);}
        
               
        }
    }
     return retVal; 
    
    }
}