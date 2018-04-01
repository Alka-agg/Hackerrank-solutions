import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingLeaderBoard {

   /* static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Complete this function
    }*/

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int rank = 1;
        int ne = n-1;
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            if(alice_i == 0)
            {
                for(int i=0;i<n;i++)
                {
                    if(alice[alice_i]==scores[i])
                    {
                        System.out.println(rank);
                       break;
                    }
                     else if(alice[alice_i]>scores[i])
                    {
                       System.out.println(rank);
                        break;
                    }
                     else if(alice[alice_i]<scores[i])
                {
                         if(i==0)
                         {
                             rank++;
                         }
                         else{
                             if(scores[i]!=scores[i-1])
                             {
                                  if(i!=(n-1))
                                 {
                                     rank++;
                                  }
                                 else{
                                     rank++;
                                     System.out.println(rank);
                                 }
                             }
                             else if((i==n-1) && (scores[i]==scores[i-1]))
                                 System.out.println(rank);
                         }
                        
                     }
                     ne=i;
                }
            }
            else
            {
               
                while(ne>=0)
                {
                    if(alice[alice_i]==scores[ne])
                    {
                    	if(alice[alice_i]!=alice[alice_i-1])
                    	{ if(rank!=1)
                        rank--; }
                        System.out.println(rank);
                        if(ne!=0)
                        ne--;
                       break;
                    }
                    else if(alice[alice_i]<scores[ne])
                    {
                       System.out.println(rank);
                        break;
                    }
                 else if(alice[alice_i]>scores[ne])
                {
                     
                 if(ne!=0)
                 {
                     if((ne!=(n-1)) && scores[ne]==scores[ne+1])
                         ne--;
                     else{
                         ne--;
                          if(rank!=1)
                         rank--;
                     }
                 }
                     else{
                         if(scores[ne]==scores[ne+1])
                         {
                             System.out.println(rank);
                             break;
                         }
                         else{
                             if(rank!=1)
                             rank--;
                             System.out.println(rank);
                             break;
                         }
                     }
                      
                }
            }
            }
          
            }
       /* int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");*/
        
        


        in.close();
    }
}
