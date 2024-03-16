Here is the equivalent Java code for the provided Python script. The Java code includes taking inputs from the user, processing the information, and then outputting the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int c = 0; c <= b - a; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
```

You can use this Java code by running it inside a Java environment. It will perform the same functionality as the Python code provided, which calculates the number of occurrences where `(h % (a + c))` equals `0` for `c` in the range from `0` to `b - a` inclusive.
