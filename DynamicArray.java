import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DynamicArray {

    /*
     * Complete the dynamicArray function below.
     */
    static int[] dynamicArray(int n, int[][] queries, int q) {
        /*
         * Write your code here.
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
         ArrayList<Integer>[] x = new ArrayList[n];
        for (int y = 0; y < n; y++) {
            x[y] = new ArrayList<Integer>();
        }
        int lastans=0;
        for(int i=0;i<q;i++)
        {
            if(queries[i][0]==1)
            {
                int k = ((queries[i][1])^lastans)%n;
                x[k].add(queries[i][2]);
            }
            else if(queries[i][0]==2)
            {
                int k = ((queries[i][1])^lastans)%n;
                int m = (queries[i][2])%(x[k].size());
                lastans = x[k].get(m);
                list.add(lastans);
            }
        }
         int[] ret = new int[list.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = list.get(i).intValue();
    }
    return ret;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = dynamicArray(n, queries, q);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
