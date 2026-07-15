class Solution {
    public int[] twoSum(int[] a, int target) {
        int[] ans=new int[2];
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]+a[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(a[i]+a[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}