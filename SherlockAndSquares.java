import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

   /* static int squares(int a, int b) {
        // Complete this function
    } */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            double a = in.nextInt();
            int b = in.nextInt();
            int count = 0,sqr;
            int sq = (int)Math.sqrt(a);
            for(int i=sq; i<=b;i++)
            {
                sqr=i*i;
                if((sqr>=a) && (sqr<=b))
                    count++;
                if(sqr>b)
                    break;
            }
            System.out.println(count);
            
            
            
            
           /* int result = squares(a, b);
            System.out.println(result);  */
        }
        in.close();
    }
}
