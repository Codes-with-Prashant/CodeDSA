class Solution {
    public class Pair implements Comparable<Pair>{
           TreeNode node;
           int w, d;
           Pair(TreeNode node, int w, int d)
           {
               this.node=node;
               this.w=w;
               this.d=d;
           }
           public int compareTo(Pair other){
               if(this.d==other.d){return this.node.val-other.node.val;}
               else{return this.d-other.d;}
           }
       }
   public List<List<Integer>> verticalTraversal(TreeNode root) {
      
 Queue<Pair> queue= new LinkedList<>();
       queue.add(new Pair(root, 0,1));
       int lmw=0;int rmw=0;
    HashMap<Integer, PriorityQueue<Pair>>map=new HashMap<>();
       while(queue.size()>0){
           Pair temp=queue.remove();
           if(temp.w<lmw)
               lmw=temp.w;
           if(temp.w>rmw)
               rmw=temp.w;
           if(map.containsKey(temp.w)==false){
               map.put(temp.w, new PriorityQueue<>());
               map.get(temp.w).add(temp);
                       }
           else{map.get(temp.w).add(temp);}
           if(temp.node.left!=null){queue.add(new Pair(temp.node.left, temp.w-1, temp.d+1));}
if(temp.node.right!=null){queue.add(new Pair(temp.node.right, temp.w+1, temp.d+1));}           
       }
       List<List<Integer>> res=new ArrayList<>();
           for(int w= lmw; w<=rmw;w++){
               ArrayList<Integer> list = new ArrayList<>();
               PriorityQueue<Pair>pq=map.get(w);
               while(pq.size()>0)
               {
                   Pair temp= pq.remove();
                   list.add(temp.node.val);
               }
               res.add(list);}
           return res;
  
   }
}