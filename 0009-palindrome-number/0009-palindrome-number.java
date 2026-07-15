class Solution {
    public boolean isPalindrome(int x) {
    if(x<0){
        return false;
    }
        int reverse=0;
        int save=x;
        while(x!=0){
            int r=x%10;
            x=x/10;
            reverse=reverse*10;
            reverse=reverse+r;
        }
        return save == reverse;
    }
}