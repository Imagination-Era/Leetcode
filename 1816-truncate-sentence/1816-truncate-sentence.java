class Solution {
    public String truncateSentence(String s, int k) {
        
        StringBuilder f=new StringBuilder();
        String p[]=s.split(" ");
        for(int i=0;i<k;i++){
            f.append(p[i]);
                     if(i<k-1){
                         f.append(" ");
                     }
        }
        return f.toString();
    }
}