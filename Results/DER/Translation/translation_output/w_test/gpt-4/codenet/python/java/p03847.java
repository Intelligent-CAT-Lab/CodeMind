Here's the translated Java code from the provided Python sample:

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static final int MOD = (int) (1e9 + 7);
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        memo.put(0, 1);
        memo.put(1, 2);

        System.out.println(func(N));
    }

    private static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        memo.put(N, result);
        return result;
    }
}
```

Please note that in Java, integers are by default floor divided when using the `/` operator; this matches the behavior of the division in the provided Python code (which used integer division). The `MOD` value is defined as a constant as it's good practice in Java to use constants for such literals.

Before running this code ensure that you have Java installed on your system and that you can compile and run Java programs. Save the code in a file named `Main.java`, compile it with `javac Main.java`, and run it with `java Main`. Input the test case when prompted. For the test case of `3`, the output should indeed be `5`.
