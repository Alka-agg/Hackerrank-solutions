import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfThePragrammer {

    static String solve(int year){
        // Complete this function
        int dd,yyyy;
        String date="\0", mm="00";
        if(year==1918)
        {
            dd=26;
            mm="09";
            yyyy=1918;
            date= dd+"."+mm+"."+yyyy;
        }
        else if(year<1918)
        {
            if(year%4==0)
            {
                dd=12;
                mm="09";
                yyyy= year;
                date= dd+"."+mm+"."+yyyy; 
            }
            else
            {
                 dd=13;
                mm="09";
                yyyy= year;
                date= dd+"."+mm+"."+yyyy;
            }
        }
        else if(year>1918)
        {
            if((year%4==0 && year%100!=0) || (year%400==0))
            {
                dd=12;
                mm="09";
                yyyy= year;
                date= dd+"."+mm+"."+yyyy;
            }
            else
            {
                dd=13;
                mm="09";
                yyyy= year;
                date= dd+"."+mm+"."+yyyy;
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
