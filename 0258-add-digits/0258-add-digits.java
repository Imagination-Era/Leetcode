class Solution {
    public int addDigits(int num) {
        int add=0;
        int k=0;
        while(num>9){
        while(num>0){
            add+=num%10;
            num=num/10;
            }
            
            num=add;
            add=0;
        } 
        return num;
    }
}