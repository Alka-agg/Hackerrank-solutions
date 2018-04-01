import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {

  /*  static int[] breakingRecords(int[] score) {
        // Complete this function
    }
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
       // int max,int min;
        int minc=0,maxc=0;
        
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int max,min;
            max=score[0];
            min=score[0];
           for(int score_i = 0; score_i < n; score_i++){ 
            if(score[score_i]<min)
            {
                min=score[score_i];
                minc++;
            }
            else if(score[score_i]>max)
            {
                max=score[score_i];
                maxc++;
            }
                
        }
       /* int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");*/
        System.out.print(maxc +" " + minc);
        


        in.close();
    }
}
