import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Pangrams {

    /*
     * Complete the pangrams function below.
     */
    static String pangrams(String s) {
        /*
         * Write your code here.
         
         */
        String str = new String();
        int count=0;
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++)
            {
                char ch= s.charAt(i);
            if(Character.isLowerCase(ch))
            { int as = (int)ch -97;
              arr[as] =1;
            }
            else if(Character.isUpperCase(ch))
            {
                int as = (int)ch -65;
              arr[as] =1;
            }
            }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=1)
            {
                str = "not pangram";
            break;
            }
            else
                count++;
        }
        if(count==26)
            str="pangram";
        
        return str;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
