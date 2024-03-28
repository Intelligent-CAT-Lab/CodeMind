Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

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
        
        for (int i = 0; i < 1000000; i++) {
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

This Java code includes the equivalent functionality to the Python code: it checks if `K` is even, then loops up to 1,000,000 times trying to find a number composed only of 7s that is divisible by `K`, and exits when it finds such a number or after it finishes the loop.
