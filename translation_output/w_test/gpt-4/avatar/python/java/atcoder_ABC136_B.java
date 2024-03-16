Here is the translated Java code which performs the same functionality as the given Python code:

```java
import java.util.Scanner;

public class OddDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
```

You'd compile and run this Java program, and it would wait for an input of a number (like 99999), then output the amount of numbers with an odd number of digits (like 90909) up to and including the number you inputted.
