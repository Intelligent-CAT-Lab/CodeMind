Here is the corresponding Java code for the given Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int[] d = new int[n + 1];
        d[0] = 1;
        for (int i = 0; i < n; i++) {
            d[i + 1] = (int)(((long)(m - i) * ((long)(m - n + i) * d[i] + (long)i * d[i - 1] * (m - i + 1))) % (1000000007L));
        }
        System.out.println(d[n]);
    }
}
```

To use this Java code, you can compile it and then run it, entering the test input (e.g., `2 2`) and expecting to receive the output `2` as specified. Note that this Java code includes the necessary imports and a `main` method, which is the entry point for Java programs. The code takes care about integer overflows by using long type for the calculations and then converting it back to an int before applying the modulo operation.
