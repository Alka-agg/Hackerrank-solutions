import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SaveThePrisoner {

  /*  static int saveThePrisoner(int n, int m, int s){
        // Complete this function
    }
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int k = 0;
            int p = s+m-1;
            int pr = p % n;
            if(pr==0)
            System.out.println(n);
            else
                System.out.println(pr);
            
          /*  int result = saveThePrisoner(n, m, s);
            System.out.println(result); */
        }
    }
}
