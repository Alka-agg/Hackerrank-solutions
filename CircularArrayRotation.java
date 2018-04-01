import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

   /* static int[] circularArrayRotation(int[] a, int[] m ,int n, int k, int q) {
        // Complete this function
    /*    for(int i=1; i<=k;i++)
        {
            for(int j=0; j<n;j++)
            {
                
            }
        }
        if(k>n)
            k=k%n;
        for(int i=1; i<=k;i++)
        {
            
        }
    }
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        if(k>n)
            k=k%n;
        int p=0;
        int pa=0;
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
             p = n+m[m_i]-k;
            pa = p%n;
            System.out.println(a[pa]);
            
        }
    /*    int[] result = circularArrayRotation(a, m,n,k,q);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");*/


        in.close();
    }
}
