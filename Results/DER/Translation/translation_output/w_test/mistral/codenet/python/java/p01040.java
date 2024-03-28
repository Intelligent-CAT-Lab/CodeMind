<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1, m1, d1, y2, m2, d2;
        y1 = scanner.nextInt();
        m1 = scanner.nextInt();
        d1 = scanner.nextInt();
        y2 = scanner.nextInt();
        m2 = scanner.nextInt();
        d2 = scanner.nextInt();
        int qq = y1 / 400;
        y1 %= 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);
        LocalDate d = LocalDate.of(y1, m1, d1);
        while (d.isBefore(LocalDate.of(y2, m2, d2))) {
            if (d.get(ChronoUnit.DAY_OF_WEEK) == 13 && d.get(ChronoUnit.DAY_OF_WEEK) == 4) {
                a++;
            }
            d = d.plusDays(1);
        }
        System.out.println(a);
    }
}
```</s>
