Below is the Java translation of the provided Python code snippet. The code calculates the sum of the greatest common divisor (gcd) for all combinations of three numbers ranging from 1 to a given input `K`.

```java
import java.util.Scanner;

public class GcdSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
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

You would compile and run this Java program, and upon inputting the integer 2, it should output 20 as expected.

Remember to have the `java.util.Scanner` import at the start of your Java file to use the Scanner for input.
