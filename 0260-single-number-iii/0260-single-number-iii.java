class Solution {
    public int[] singleNumber(int[] nums) {
        int arrs[]=new int[2];
        int n = 0;
        for(int i = 0;i<nums.length;i++){
            int c = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c+=1;
                }
            }
            if(c==1){
                arrs[n]=nums[i];
                n=n+1;
            }
        }
        
        return arrs;
    }
}