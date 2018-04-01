import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovie {

    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        int count=0;
        for(int m=i; m<=j; m++)
        {
           int n = m/10;
            int p = m%10;
            int rev=p;
            int q=0;
            while(n>0)
            {
                q=n%10;
                n=n/10;
                rev= rev*10+q;
                
            }
            int dif = Math.abs(rev-m);
            int beau = dif%k;
            if(beau==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
