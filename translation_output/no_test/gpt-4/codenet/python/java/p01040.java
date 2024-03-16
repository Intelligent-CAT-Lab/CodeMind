Here is the translated code from Python to Java. I have provided comments within the code to give an idea of what each part of the code is doing, similar to the original Python code:

```java
import java.time.LocalDate;
import java.util.Scanner;

public class FridayTheThirteenthCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        int qq = y1 / 400;
        y1 %= 400;
        y1 += 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate date = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        while (!date.isAfter(endDate)) {
            if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) { // In Java, day of the week is 1-7 for Monday-Sunday
                a += 1;
            }
            date = date.plusDays(1);
        }

        System.out.println(a);
    }
}
```

Make sure you have Java installed on your machine and compile the program with `javac FridayTheThirteenthCount.java` before running it with `java FridayTheThirteenthCount`. When running the program, it will wait for inputs as described in the Python code; you should provide the values in the same order separated by spaces (e.g., `2000 1 1 2020 1 1`). The output will be the count of Friday the 13ths that occurred within the given date range.
