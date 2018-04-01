import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopiaTree {

  /*  static int utopianTree(int n) {
        // Complete this function
        
    } */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int h=1;
            for(int i=0; i<=n; i++)
            {
                if((i%2)!=0)
                {
                   h=2*h; 
                }
               else if((i!=0) && ((i%2)==0))
               {
                   h=h+1;
               }
            }
            
            System.out.println(h);
          /*  int result = utopianTree(n);
            System.out.println(result); */
        }
        in.close();
    }
}
