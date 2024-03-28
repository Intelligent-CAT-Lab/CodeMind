import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p01040 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1 = in.nextInt();
        int m1 = in.nextInt();
        int d1 = in.nextInt();
        int y2 = in.nextInt();
        int m2 = in.nextInt();
        int d2 = in.nextInt();
        int a=0;
        int qq,y11;
        qq=y1/400;
        y11=y1%400;
        qq--;
        int q=(y2-y1)/400;
        y2-=400*q;
        a=688*(q-qq);
        Date d=new Date(y1,m1,d1);
        while(d<=new Date(y2,m2,d2)){
            if(d.getDay()==13 && d.getDay()==4)a++;
            d+=1;
        }
        System.out.println(a);
    }
}





Exception in thread "main" java.lang.IllegalArgumentException: day out of range: 13
    at java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2091)
    at java.util.Calendar.updateTime(Calendar.java:3458)
    at java.util.Calendar.getTimeInMillis(Calendar.java:1769)
    at java.util.Date.getTime(Date.java:557)
    at Solution.main(Solution.java:21)





Date d = new Date(y1,m1,d1);
int dayOfWeek = d.getDay();