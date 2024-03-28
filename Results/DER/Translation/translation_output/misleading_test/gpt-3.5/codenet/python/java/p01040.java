```java
import java.util.Scanner;
import java.time.LocalDate;

public class FridayTheThirteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int qq = y1 / 400;
        y1 += 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate date = LocalDate.of(y1, m1, d1);
        while (!date.isAfter(LocalDate.of(y2, m2, d2))) {
            if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            date = date.plusDays(1);
        }

        System.out.println(a);
    }
}
```
```
