Here's the translated Java code for the given Python program:

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
            return;
        }
        
        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }
        
        System.out.println(-1);
    }
}
```

This Java code takes an input number `K`, checks whether it's even, and if not, it iteratively updates the value of `now` while looking for a multiple of `K` that consists only of the digit `7`. If such a number is found within 1,000,000 iterations, the program prints the length of that number. If not found, it prints `-1`.
