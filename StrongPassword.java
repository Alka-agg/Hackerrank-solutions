import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int p=1,q=1,r=1,a=0,f=0,t=1;
        int y;
        
            a=6-n;
        
        if(password.matches(".*[a-z].*"))
            p=0;
        if(password.matches(".*[A-Z].*"))
            q=0;
        if(password.matches(".*[0-9].*"))
            r=0;
        if(password.matches(".*[-!@#$%^&*()+].*"))
            t=0;
        
        if(a<=0)
            f=p+q+r+t;
        else if(a==1)
        {
            y=a+p+q+r+t-1;
            if(y<1)
                f=a;
            else
                f=y;
        }
        else if(a==2)
        {
            y=a+p+q+r+t-2;
            if(y<2)
                f=a;
            else
                f=y;
        }
        else
            f=a;
        
        return f;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
