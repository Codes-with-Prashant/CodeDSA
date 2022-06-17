class Solution {
    public int countD(int n)
    {   int digits = 0;
        
        while(n != 0){
            n = n/10;
            digits++;
        }
    return digits;}
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i : nums)
        {if(countD(i)%2==0)
            count++;
            
        }
        return count;
    }
}