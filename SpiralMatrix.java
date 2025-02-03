import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return spiral;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;


        while (top <= bottom && left <= right) {
            //traversing through the top row
            for (int j = left; j <= right; j++) {
                spiral.add(matrix[top][j]);
            }
            top++;  //move down

            //traversing through the last column
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;  //move left

            //traversing through the bottom from right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    spiral.add(matrix[bottom][j]);
                }
                bottom--;  //move up
            }

            // Traverse from right to left along the bottom row
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;  //move right
            }
        }


        return spiral;
    }


}