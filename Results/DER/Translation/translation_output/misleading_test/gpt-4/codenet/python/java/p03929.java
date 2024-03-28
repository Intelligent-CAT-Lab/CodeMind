Here's the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class CalculationProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int[] r = new int[11];
        for (int i = 1; i <= 11; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) {
                    m += 1;
                }
            }
            r[i - 1] = m;
        }

        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        for (int i : r) {
            ans += a * i;
        }
        if (b < 1) ans -= r[10];
        if (b < 2) ans -= r[9];
        if (b >= 3) {
            for (int i = 0; i < b - 2; i++) {
                ans += r[i];
            }
        }
        System.out.println(ans);
    }
}
```

To compile and run this Java program, you would need to use a Java compiler (like `javac`) or an IDE that supports Java development, such as IntelliJ IDEA or Eclipse. The standard procedure is to save this code in a file with a `.java` extension, like `CalculationProblem.java`, compile it using `javac CalculationProblem.java`, and then run the compiled class file with `java CalculationProblem`.

Please replace the comment with an appropriate comment in English (or your preferred language), as it appears to be in a different language (possibly Japanese), and I cannot translate it as I don't understand its meaning.
