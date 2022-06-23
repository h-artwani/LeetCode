//674

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1, max = 0;
        if(nums.length == 1) return 1;
        for( int i = 1; i < nums.length ; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
