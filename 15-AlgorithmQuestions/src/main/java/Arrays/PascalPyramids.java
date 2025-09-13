package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalPyramids {

    public static void main(String[] args) {

        System.out.println(pascalPyramids(6));

    }

    public static List<List<Integer>> pascalPyramids( int numRows){

        List<List<Integer>> allList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {  //row index 3.  3

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                //1,
                if( j == 0 || i == 1 || j == i){
                    list.add(1);
                } else{
                    int result = allList.get(i-1).get(j) + allList.get(i-1).get(j-1);
                    list.add (result);
                }

            }
            allList.add(list);
        }

        return allList;


    }


}
