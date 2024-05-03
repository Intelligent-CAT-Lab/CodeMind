Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int cnt = 0;
        int now = 0;
        if (K % 2 == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < (int) Math.pow(10, 6); i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's even, and if so, prints -1 and exits. If it's odd, it enters a loop that multiplies the current number by 10 and adds 7, taking the modulus of that result by K. If the result is 0, it prints the number of iterations it took to get there and exits. If it goes through the loop 10^6 times without finding 0, it prints -1 and exits.
