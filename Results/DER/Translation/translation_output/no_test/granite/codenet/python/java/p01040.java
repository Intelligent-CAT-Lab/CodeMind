System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
```java
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] date1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] date2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int y1 = date1[0], m1 = date1[1], d1 = date1[2];
        int y2 = date2[0], m2 = date2[1], d2 = date2[2];
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
```<|endoftext|>
