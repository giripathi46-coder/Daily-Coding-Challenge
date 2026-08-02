class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] na = new int[nums.length];
        int f = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                na[f]=nums[i];
                f+=1;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
                na[f]=nums[j];
                f+=1;
            }

        }
    return na;
}
}