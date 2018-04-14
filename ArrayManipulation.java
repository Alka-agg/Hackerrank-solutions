import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayManipulation {

    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries, int m) {
        /*
         * Write your code here.
         */
        long[] list = new long[n];
      //  int[] d = new int[n+1];
        for(int i=0; i<m; i++)
        {
            int k = queries[i][0];
            int l = queries[i][1];
            long p = queries[i][2];
            
            
            list[k-1]+=p;
            if(l<n)
            list[l]-=p;
            
        }
        long temp=0;
        long max=0;
        for(int i=0;i<n;i++)
        {
           temp+=list[i];
            if(temp>max)
                max=temp;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries,m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
