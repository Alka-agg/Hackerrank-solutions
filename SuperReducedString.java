import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static void super_reduced_string(String s){
        // Complete this function
     StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<sb.length();i++)
        {
            if(sb.charAt(i)== sb.charAt(i-1))
            {
                
                sb.delete(i-1,i+1);
                i=0;
            }
        }
        
       if(sb.length()==0)
           System.out.println("Empty String");
        else
            System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
         super_reduced_string(s);
       // System.out.println(result);
    }
}
