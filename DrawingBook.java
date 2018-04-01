import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        int h=n/2;
        int hi=h+1;
        int min=0;
        if(p<h)
        {
            min=p/2;
        }
        
        
       else if(p>h)
       {
           if(n%2==0 && p==n-1)
               min= 1;
           else
         min= (n-p)/2;
       }
         else if(p==h)
        {
          min=h/2;  
        }
        
      /*  if(n%2!=0)
        {
            if(p>h && p>h+1)
                min=(n-p)/2;
            else if(p==h || p==h+1)
                min=h/2;
        }*/
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
