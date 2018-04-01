import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

   /* static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int i;
       // String result = kangaroo(x1, v1, x2, v2);
        //System.out.println(result);
        if((x1<x2 && (v1<v2 ||v1==v2)) || (x2<x1 && (v2<v1 || v1==v2)))
            System.out.println("NO");
       /* else if(x1==x2 && v1!=v2)
            System.out.println("NO"); 
        else if(x1==x2 && v1==v2)
            System.out.println("YES"); */
       else if((x1<x2 && v1>v2) || (x1>x2 && v1<v2))
       {
           for(i=1; i<1000000; i++)
           {
               if((x1+(v1*i))==(x2+(v2*i)))
               { System.out.println("YES");
               System.exit(0);
               }
               
           }
           
            System.out.println("NO");
       }
        
    }
}
