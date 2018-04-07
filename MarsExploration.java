import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    static int marsExploration(String s) {
        // Complete this function
        int count=0;
        int l = s.length();
        if(l%3!=0)
            count= l%3;
        for(int i=1;i<=l;i++)
        {
            char ch = s.charAt(i-1);
            if(i%3==2)
            {
                if(ch!='O')
                    count++;
            }
            else
            {
                if(ch!='S')
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
