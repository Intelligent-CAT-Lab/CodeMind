Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && t % 60 + a >= c) {
                System.out.println((t / 60) * 60 + c);
                return;
            }
            t += a + b;
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, then it loops from 0 to 60. If the current time (t) modulo 60 is less than or equal to c and less than or equal to the current time plus a, it prints the current time and breaks the loop. If it goes through all the loops without finding a suitable time, it prints -1.
