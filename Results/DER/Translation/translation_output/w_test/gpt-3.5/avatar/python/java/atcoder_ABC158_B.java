```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);
    }
}
```
