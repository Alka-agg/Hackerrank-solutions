import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c, int k, int n) {
        // Complete this function
        int E = 100;
        int spos = 0;
        do{
            spos= (spos+k)%n;
            if(c[spos]==0)
                E= E-1;
            else
                E=E-3;
        }while(spos!=0);
        return E;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k, n);
        System.out.println(result);
        in.close();
    }
}
