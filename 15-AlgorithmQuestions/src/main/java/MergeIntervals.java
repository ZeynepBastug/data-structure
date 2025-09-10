import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {3,5}, {4,7}, {6,8}, {9,10}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }

    public static int[][] mergeIntervals(int[][] intervals){

        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0],b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInt = sortedIntervals[0];
        mergedIntervals.add(currentInt);

        for (int[] nextInt : sortedIntervals) {

            int currentIntEnd = currentInt[1];
            int nextIntStart = nextInt[0];
            int nextIntEnd = nextInt[1];

            if(currentIntEnd >= nextIntStart) {
                currentInt[1] = Math.max(currentIntEnd, nextIntEnd);
            }else{
                currentInt = nextInt;
                mergedIntervals.add(currentInt);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);




    }
}
