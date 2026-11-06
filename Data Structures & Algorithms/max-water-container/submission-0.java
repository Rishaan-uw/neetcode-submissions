class Solution {
    public int maxArea(int[] heights) {
        int maxVol = 0;
        int l = 0;
        int r = heights.length - 1;
        while(r > l){
            int vol = Math.min(heights[l], heights[r]) * (r - l);

            maxVol = Math.max(maxVol, vol);

            if (heights[l] < heights[r]) {
                l++;
            } else if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
                r--;
            }
        } 

        return maxVol;
    }
}
