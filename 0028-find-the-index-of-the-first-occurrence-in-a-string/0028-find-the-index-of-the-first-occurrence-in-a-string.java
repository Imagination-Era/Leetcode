class Solution {
    public int strStr(String haystack, String needle) {
        boolean k=haystack.contains(needle);
        if(k){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
        
    }
}