import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ElectronicsShop {

    static int getMoneySpent(int[] k, int[] d, int s, int n, int m){
        // Complete this function
        int max=-1,sum=0;
        Arrays.sort(d);
        for(int i=0; i<n; i++)
        {
            int j=m-1;
          //  sum= k[i]+d[j];
            do
            {
                sum=k[i] + d[j];
                 j--;
            }while(sum>s && j>=0);
            if(sum>max && sum<=s)
            {
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s,n,m);
        System.out.println(moneySpent);
    }
}
