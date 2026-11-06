class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = (rows * cols) - 1;

        while(l <= r){
            int mid = (l+r)/2;
            int midRow = mid / cols;
            int midCol = mid % cols;
            if(matrix[midRow][midCol] < target){
                l = mid + 1;
            } else if(matrix[midRow][midCol] > target){
                r = mid - 1;
            } else{
                return true;
            }
        }
        return false;
    }
}
