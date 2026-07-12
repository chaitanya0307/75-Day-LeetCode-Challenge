class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
    for(Integer i:nums){
        if(h.containsKey(i)){
        int count=h.get(i);
        count++;
        h.put(i,count);
    }
    else{
        h.put(i,1);
    }
    }
    for(Integer i:h.keySet()){
        if(h.get(i)==2){
            ans.add(i);
        }
    }
    return ans;
    }
}