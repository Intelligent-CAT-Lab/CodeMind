Here's the translated Java code that performs the same function as the provided Python code. 

```java
import java.util.Scanner;

public class GCDSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

To run this Java program, compile it with `javac GCDSum.java` and run it with `java GCDSum`. It'll prompt you to input the integer K, and after you enter `2`, it should output `9` as expected.
