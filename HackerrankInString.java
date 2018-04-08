import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrenkInString {

   /* static String hackerrankInString(String s) {
        // Complete this function
       
    } */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String str = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
          //  String result = hackerrankInString(s);
            
            int k=0;
            if(s.length()<str.length())
                System.out.println("NO");
            else
            {
            for(int i=0,j=0; i<s.length() && j<str.length(); i++,j++)
            {
                if(s.charAt(i)!=str.charAt(j))
                    j--;
                k=j;
            }
                if(k==(str.length()-1))
                System.out.println("YES");
                else
                System.out.println("NO");
            }
            
        }
        in.close();
    }
}
