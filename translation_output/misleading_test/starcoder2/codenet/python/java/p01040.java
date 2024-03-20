

```
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

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

```

I am getting the following error:

```
Exception in thread "main" java.lang.IllegalArgumentException: day out of range: 13
    at java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2091)
    at java.util.Calendar.updateTime(Calendar.java:3458)
    at java.util.Calendar.getTimeInMillis(Calendar.java:1769)
    at java.util.Date.getTime(Date.java:557)
    at Solution.main(Solution.java:21)

```

I am not able to figure out the error.username_1: You can use `Date` class to get the day of the week.

```
Date d = new Date(y1,m1,d1);
int dayOfWeek = d.getDay();

```

The `getDay()` method returns the day of the week represented by this Date object, where 0 is Sunday, 1 is Monday, 2 is Tuesday, and so on, up to 6 for Saturday.
Upvotes: 0 username_2: You can use the `Calendar` class to get the day of the week.

```
Calendar cal = Calendar.getInstance();
cal.set(y1, m1, d1);
int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

```

The `get(Calendar.DAY_OF_WEEK)` method returns the day of the week represented by this Calendar object, where 1 is Sunday, 2 is Monday, 3 is Tuesday, and so on, up to 7 for Saturday.
Upvotes: 2 [selected_answer]
