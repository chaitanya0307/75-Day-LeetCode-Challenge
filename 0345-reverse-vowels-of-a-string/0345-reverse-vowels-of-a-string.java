class Solution {
    public String reverseVowels(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        char[] a=s.toCharArray();
        h.put('A',1);
        h.put('E',1);
        h.put('I',1);
        h.put('O',1);
        h.put('U',1);
        h.put('a',1);
        h.put('e',1);
        h.put('i',1);
        h.put('o',1);
        h.put('u',1);
        int i=0;
        int j=a.length-1;
        while(i<j){
            while (i < j && !h.containsKey(a[i])) {
            i++;
        }

        while (i < j && !h.containsKey(a[j])) {
        j--;
        }
            if(i<j){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}