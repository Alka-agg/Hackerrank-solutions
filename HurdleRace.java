import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HurdleRace {

    static int hurdleRace(int n,int k, int[] height) {
        // Complete this function
        int max= height[0];
       // int bev=0;
        for(int j=1;j<n;j++)
        {
            if(height[j]> max)
                max=height[j];
        }
        int bev = max-k;
        if(bev<0)
            bev=0;
        return bev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(n,k, height);
        System.out.println(result);
        in.close();
    }
}
