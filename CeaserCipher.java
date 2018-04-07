import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeaserCipher {

    static String caesarCipher(String s, int k, int n) {
        // Complete this function
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
            
                if(Character.isLowerCase(ch))
                {
                    int as = (int)ch;
            int tr = as-97;
         //   System.out.println(tr);
           int ad = ((tr+k)%26)+97;
         //   System.out.println(ad);
            char ne = (char)ad;
            sb.setCharAt(i,ne);
               }
                if(Character.isUpperCase(ch))
                {
                    int as = (int)ch;
            int tr = as-65;
         //   System.out.println(tr);
           int ad = ((tr+k)%26)+65;
         //   System.out.println(ad);
            char ne = (char)ad;
            sb.setCharAt(i,ne);
            } 
        }
        }
        String str = new String(sb);
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k,n);
        System.out.println(result);
        in.close();
        
    }
}
