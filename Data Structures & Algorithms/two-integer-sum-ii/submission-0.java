class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int r = 0;
        int l = numbers.length - 1;
        while((numbers[r] + numbers[l]) != target){
            if((numbers[r] + numbers[l]) < target){
                r++;
            } else if ((numbers[r] + numbers[l]) > target){
                l--;
            }
        }
        output[0] = r + 1;
        output[1] = l + 1;
        return output;
    }
}
