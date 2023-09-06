class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean u=false;
         for(char k:s.toCharArray()){
             if(!u && k=='*'){
                 count++;
             }
             if(k=='|'){
                 u=!u;
             }
         }
         return count;
    }
        

}
    