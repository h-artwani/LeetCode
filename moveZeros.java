//Problem 283

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        if(nums.length != 1){
            for( int i = 0; i < nums.length ; i++){
                if( nums[i] != 0){
                    nums[k] = nums[i];
                    if(i!=k) nums[i] = 0;
                    i = k;
                    k++;
                }
            }
        }
        
    }
}
