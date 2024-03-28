```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);
    }
}
```
