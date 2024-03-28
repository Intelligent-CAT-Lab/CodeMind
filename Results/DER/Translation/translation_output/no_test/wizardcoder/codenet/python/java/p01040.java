Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.time.LocalDate;
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

        int qq = y1 / 400;
        y1 %= 400;
        y1 += 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        for (int i = 0; i <= daysBetween; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            if (currentDate.getDayOfMonth() == 13 && currentDate.getDayOfWeek().getValue() == 4) {
                a++;
            }
        }

        System.out.println(a);
    }
}
```<|endoftext|>
