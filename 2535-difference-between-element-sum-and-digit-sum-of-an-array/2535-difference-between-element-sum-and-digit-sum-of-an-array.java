class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
             
            int v=nums[i];
           
             while(v>0){
                 ds+=v%10;
                 v=v/10;
             }
        }
        return Math.abs(ds-es);
    }
}