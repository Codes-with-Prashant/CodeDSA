class Solution {
    public double average(int[] salary) {
      double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        for (int i = 0; i < salary.length; i++) {
  min = Math.min(min, salary[i]);
      max = Math.max(max, salary[i]);

    }
        
        double sum=0;
        for(int x:salary){sum+=x;}
        sum=sum-(max+min);
        return sum/(salary.length-2);
    }
}