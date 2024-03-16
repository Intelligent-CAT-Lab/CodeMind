```java
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        String[] day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = X % 7;

        if (a == 2 || a == 3) {
            System.out.println(day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(day[a + 3]);
        }
    }
}
```
