Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println(4L * a * b < (long) (c - a - b) * (c - a - b) ? "Yes" : "No");
        }
        sc.close();
    }
}
```

This Java program does the equivalent of the given Python code. It reads three integers from the standard input, then applies the same logic as described in the Python code. Note the use of `long` to ensure that the calculation does not overflow when handling large integers since Java is strictly typed and requires explicit handling of larger-than-int size numbers.
