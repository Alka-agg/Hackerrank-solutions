import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    static int pickingNumbers(int[] a, int n) {
        // Complete this function
        Arrays.sort(a);
        int max=0, val=0, na= n+1;
        int[] b = new int[na];
        int j=0;
        for(int i=0;i<na;i++)
        {
            b[i]=0;
        }
        for(int i=0; i<n; i++)
        {
            int ni=0, count=0;
            val=a[i];
            int k = 0;
         /*   do
            {
                count++;
                k++;
            }while(a[k]==val && k<n); */
            for(k= i;k<n;k++)
            {
                if(a[k]==val)
                count++;
                else
                    break;
            }
            ni= k-1;
       /*  while((a[k]==val+1) && k<n)
            {
                count++;
                k++;
            } */
            for(int m= k;m<n;m++)
            {
                if(a[m]==val+1)
                count++;
                else
                    break;
            }
            b[++j]=count;
            i=ni;
        }
        Arrays.sort(b);
        max= b[n];
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a,n);
        System.out.println(result);
        in.close();
    }
}
