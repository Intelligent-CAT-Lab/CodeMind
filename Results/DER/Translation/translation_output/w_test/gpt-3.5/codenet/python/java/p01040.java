```java
import java.util.Scanner;
import java.time.LocalDate;

public class Friday13thCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int y1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int d1 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int m2 = Integer.parseInt(input[4]);
        int d2 = Integer.parseInt(input[5]);
        sc.close();
        
        int qq, y1_orig = y1;
        int q;
        y1 += 400;
        qq = y1 / 400;
        y1 -= 400;
        qq -= 1;
        q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate startDate = LocalDate.of(y1_orig, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);
        
        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfMonth() == 13 && startDate.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            startDate = startDate.plusDays(1);
        }
        System.out.println(a);
    }
}
```

