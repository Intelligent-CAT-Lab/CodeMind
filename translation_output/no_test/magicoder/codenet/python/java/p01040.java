<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int qq = y1 / 400;
        y1 += 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate date = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        while (date.isBefore(endDate) || date.isEqual(endDate)) {
            if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            date = date.plusDays(1);
        }

        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads input from the user, calculates the number of Friday the 13ths in the given range, and prints the result. The `LocalDate` class from the `java.time` package is used to represent dates, and the `getDayOfWeek` and `getDayOfMonth` methods are used to get the day of the week and the day of the month, respectively. The `isBefore` and `isEqual` methods are used to check if the current date is before or equal to the end date. The `plusDays` method is used to increment the date by one day.<｜end▁of▁sentence｜>
