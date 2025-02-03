import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {



    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i =0; i<numRows; i++){
            List<Integer> row= new ArrayList<>();
            for(int j =0; j<= i; j++){

                //if the index of the inner array is equal to 0 or equal to 1 then 1 is added to the row
                if(j==0 || j==i){
                    row.add(1);
                }

                //else then add the sum of the values above the position in the triangle
                else{
                    row.add(triangle.get(i-1).get(j-1)+ triangle.get(i-1).get(j));
                }

            }
            triangle.add(row);
        }
        return triangle;
    }
}
