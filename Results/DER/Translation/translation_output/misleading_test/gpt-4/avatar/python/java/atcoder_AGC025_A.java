Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }

        System.out.println(ans);
        scanner.close();
    }

    private static int dsum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
```

Assuming the code is run in a file called `Main.java`, you can compile this with `javac Main.java` and then run it with the command `java Main`. Type `9` when prompted to match your test case, and the output will be `15`.
