import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

   /* static int findDigits(int n) {
        // Complete this function
        int count =0, p=0;
        int m = n;
        
        do
        {
            p = n%10;
            m = n/10;
            if((p!=0)&&(n%p)==0)
                count++;
        }while(m!=0);
        return count;
    } */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       
        int m =0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
             int count =0, p=0;
            m = n;
             
        while(m!=0)
         {
            p = m%10;
            m = m/10;
           if((p!=0)&&(n%p)==0)
               count++;  
            //System.out.println(m);
         } 
            
          //  int result = findDigits(n);
            System.out.println(count);
        }
        in.close();
    }
}
