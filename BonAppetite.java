import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetite {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] c= new int[n];
        int sum=0, anna=0;
        for(int i=0; i<n; i++)
        {
            c[i]=in.nextInt();
            if(i!=k)
            {
                sum=sum+c[i];
            }
        }
        int b=in.nextInt();
        anna= sum/2;
        if(b!=anna)
            System.out.print(b-anna);
        else
            System.out.print("Bon Appetit");
    }
}
