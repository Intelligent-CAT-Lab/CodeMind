Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && t % 60 + a >= c) {
                System.out.println((t / 60) * 60 + c);
                break;
            }
            t += a + b;
        } else {
            System.out.println(-1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then it loops from 0 to 60. If the current time (t) modulo 60 is less than or equal to c and less than or equal to c plus a, it prints the current time and breaks the loop. If it goes through all the loops without finding a suitable time, it prints -1.
