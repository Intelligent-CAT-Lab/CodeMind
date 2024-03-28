Here is the translated Java code from the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine().trim();

        int N = S.length();

        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (zeroStart != Character.getNumericValue(S.charAt(i))) {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }

        int oneStartCounter = N - zeroStartCounter;

        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}
```

Please make sure when you're running this code in your Java environment that you have the correct imports and that the `Main` class is the entry point of your application. This code snippet assumes that the input will be provided to standard input, and the output will be printed to standard output, in line with the original Python code's behavior.
