class Solution {
    public void rotate(int[][] matrix) {

        /** creates top, bottom, left, and right boundaries */
        int left = 0; int right = matrix.length - 1; 
        int top; int bottom;
        int temp;

        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                top = left;
                bottom = right;

                temp = matrix[top][left + i];

                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }
            right--; 
            left++;
        }
    }
}