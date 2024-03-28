Sure, here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        String[] Day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = X % 7;

        if (a == 2 || a == 3) {
            System.out.println(Day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(Day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(Day[a + 3]);
        }

        scanner.close();
    }
}
```

Make sure to catch possible exceptions or handle inputs according to the specific requirements of your program for production-level code.
