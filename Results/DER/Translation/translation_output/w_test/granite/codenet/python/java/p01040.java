System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2015 3 13 2015 3 13

Expected output:
1


```
import datetime
y1,m1,d1,y2,m2,d2=map(int,input().split())
qq,y1=divmod(y1,400)
y1+=400
qq-=1
q=(y2-y1)//400
y2-=400*q
a=688*(q-qq)
d=datetime.date(y1,m1,d1)
while d<=datetime.date(y2,m2,d2):
    if d.day==13 and d.weekday()==4:a+=1
    d+=datetime.timedelta(days=1)
print(a)

```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int qq = y1 / 400;
        y1 = y1 % 400 + 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 = y2 - 400 * q;
        int a = 688 * (q - qq);

        LocalDate d = LocalDate.of(y1, m1, d1);
        while (d.isBefore(LocalDate.of(y2, m2, d2))) {
            if (d.getDayOfMonth() == 13 && d.getDayOfWeek().getValue() == 4) {
                a++;
            }
            d = d.plusDays(1);
        }

        System.out.println(a);
    }
}
```

This Java code uses the `Scanner` class to read input from the user, and the `LocalDate` class from the `java.time` package to handle date calculations. The code first calculates the number of 400-year cycles between the start and end years, and then adjusts the start and end years accordingly. It then calculates the number of days between the start and end dates, and checks each day to see if it is a 13th of the month and a Thursday. If it is, the count of such days is incremented. Finally, the count is printed to the console.

You can test this code with the provided test case:

```
2015 3 13 2015 3 13
1
```<|endoftext|>
