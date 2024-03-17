<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int qq, y;
        y = y1 % 400;
        qq = y1 / 400;
        y1 += 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        Calendar calendar = new GregorianCalendar(y1, m1 - 1, d1);
        Calendar end = new GregorianCalendar(y2, m2 - 1, d2);

        while (calendar.compareTo(end) <= 0) {
            if (calendar.get(Calendar.DAY_OF_MONTH) == 13 && calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                a++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the number of Friday the 13ths in the given range, and prints the result. The main difference is that Java uses zero-based indexing for months (January is 0, not 1), and the `Calendar` class is used instead of the `datetime` module to handle dates.
<|EOT|>
