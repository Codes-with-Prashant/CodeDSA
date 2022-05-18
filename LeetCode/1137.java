class Solution {
    public int tribonacci(int n) {
         int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
      return tri(dp,n);
    }
    
     public int tri(int []dp,int n){
         if(n<=1)
            return dp[n]=n;
         if(n==2)
               return dp[n]=1;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]= tri(dp,n-1)+tri(dp,n-2)+tri(dp,n-3);
    }
}



