class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
             
            // int v=nums[i];
           
             while(nums[i]>0){
                 ds+=nums[i]%10;
                 nums[i]=nums[i]/10;
             }
        }
        return Math.abs(ds-es);
    }
}