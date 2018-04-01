import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int m,int[] arr) {
        // Complete this function
        int p=0,q=0,r=0;
    for(int i=0; i < arr.length; i++)
    {
        if(arr[i]>0)
        { 
            ++p;}
        else if(arr[i]==0)
        { ++q;}
        else if(arr[i]<0)
        {   ++r;}
    }
    float x,y,z;
    x=(float)p/m;
    y=(float)r/m;
    z=(float)q/m;
    System.out.println(x);
       
        System.out.println(y);
      
        System.out.println(z);
        
    
        
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(n,arr);
        in.close();
    }
}
