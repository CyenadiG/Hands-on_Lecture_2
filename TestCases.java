import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestCases {
    @Test
    public void testSpiralMatrix(){
        SpiralMatrix sol = new SpiralMatrix();
        //Test case 1
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected1, sol.spiralOrder(matrix));
        //Test case 2
        int[][] matrix2 ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected2, sol.spiralOrder(matrix2));



    }
    @Test
    public void testPascalTriangle() {
        PascalTriangle main = new PascalTriangle();

        //Test case 1
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected1, PascalTriangle.generate(5));

        // Test Case 2
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1)
        );
        assertEquals(expected2, PascalTriangle.generate(3));

        List<List<Integer>> expected3 = Arrays.asList();
        assertEquals(expected3, PascalTriangle.generate(0));
    }
}
    
