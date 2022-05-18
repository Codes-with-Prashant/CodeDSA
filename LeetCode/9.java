class Solution {
    public int reverse(int x){
         int t=x, rev=0, c=0;
        while(t>0){
            c=t%10;
            rev*=10;
            rev+=c;
            t/=10;   
        }return rev;
    }
    public boolean isPalindrome(int x) {
        int rev= reverse(x);
        if(x==rev)
            return true;
        else
            return false;
    }
}