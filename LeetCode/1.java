class Solution {
    public int[] twoSum(int[] nums, int target) {
       int [] ans= new int[2];
    boolean flag=false;
        for (int i=0; i<nums.length;i++)
      {
          for(int j=0;j<nums.length;j++)
          { if(j==i)
                  continue;
          if(nums[i]+nums[j]==target)
          { ans[0]=i;
           ans[1]=j;
           flag=true;
            break;}
          
      }if(flag==true){break;}
       
    } return ans;
}}