class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        // multiplying all numbers before first

        // Ex: nums = [2, 3, 4]
        // output = [1, 2, 6]
        for(int i = 1; i < nums.length; i++){
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // now going backwords
        // final output: [12, 8, 6]
        int suffix = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            output [i] *= suffix;
            suffix *= nums[i];
        }

        return output;
    }
}  
