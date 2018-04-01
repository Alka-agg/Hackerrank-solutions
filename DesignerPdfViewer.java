import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPdfViewer {

    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        int l = word.length();
        char[] ch= word.toCharArray();
        int max=0, loct=0;
        for(int i=0;i<l;i++)
        {
            int temp = (int)ch[i];
            int temp_integer = 96;
            if(temp<=122 & temp>=97)
            loct = temp-temp_integer;
            int newh= h[loct-1];
            if(max<newh)
                max=newh;

        }
        int ar= l*max;
        return ar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
