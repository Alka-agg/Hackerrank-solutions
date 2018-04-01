import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long sum=0;
        long[] s=new long[5];
        for(int i=0; i<5; i++)
        {
            sum=sum+arr[i];
        }
         for(int j=0; j<5; j++)
        {
            s[j]=sum-arr[j];
        }
        long max, min;
        max=s[0];
        min=s[0];
         for(int k=0; k<5; k++)
         {
             if(max<s[k])
                 max=s[k];
             if(min>s[k])
                 min=s[k];
         }
      System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
