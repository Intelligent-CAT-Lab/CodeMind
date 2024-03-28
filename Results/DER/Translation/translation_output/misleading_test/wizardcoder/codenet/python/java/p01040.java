Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2015 3 13 2015 3 13

Expected output:
-11

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
```java
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.close();

        int qq = (y1 - 1) / 400;
        int q = (y2 - y1) / 400;
        int a = 688 * (q - qq);

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfMonth() == 13 && startDate.getDayOfWeek().getValue() == 5) {
                a++;
            }
            startDate = startDate.plusDays(1);
        }

        System.out.println(a);
    }
}
```

Explanation:

In Java, we can use the LocalDate class to represent dates and times. We can use the ChronoUnit class to calculate the number of days between two dates. We can use a while loop to iterate over the dates between the start and end dates and check if the day is 13 and the weekday is Friday. If it is, we increment the a variable. Finally, we print the value of a.<|endoftext|>
