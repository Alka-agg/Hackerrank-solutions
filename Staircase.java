import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stairecase {

    static void staircase(int n) {
        // Complete this function
        char[][] arr = new char[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<(n-i-1); j++)
            {
                arr[i][j] = ' ';
            }
        }
       for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>(n-i-2); j--)
            {
                arr[i][j] = '#';
            }
        } 
          for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
               System.out.print(arr[i][j]);
            }
              System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
