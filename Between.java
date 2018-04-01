package rough;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Between {

    static int getTotalX(int n, int m,int[] a, int[] b) {
        // Complete this function
       int count=0;
        int minb=b[0], mina=a[0];
        for(int i=0; i<n; i++)
        {
            if(mina>a[i])
                mina=a[i];
        }
        for(int i=0; i<m; i++)
        {
            if(minb>b[i])
                minb=b[i];
        }
        int k=mina;
        while(k<=minb)
        { 
            int c=0, ca=0;
            for(int j=0;j<n;j++)
            {
                if((k%a[j])==0)
                  c++;
             else
                 break;
            }
            if(c==n)
            {
            for(int j=0; j<m; j++)
            {
                if((b[j]%k)==0)
                 ca++; 
             else
                 break;
            }
            }
            if(c!=n || ca!=m)
            {
                k++;
            }
            else if(c==n && ca==m)
            {
                k++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
       int total = getTotalX(n,m,a, b);
        System.out.println(total);
        in.close();
    }
}