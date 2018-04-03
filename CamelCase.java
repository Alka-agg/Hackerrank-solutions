import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Character.*;

public class CamelCase {

    static int camelcase(String s) {
        // Complete this function
        String[] str = s.split("[A-Z]");
        int a = str.length;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
