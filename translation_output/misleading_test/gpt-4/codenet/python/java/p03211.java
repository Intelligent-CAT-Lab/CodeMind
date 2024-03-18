Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = 99999;

        for (int i = 0; i < S.length() - 2; i++) {
            a = Math.min(a, Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))));
        }

        System.out.println(a);
    }
}
```

To compile and run this Java code, you would typically save it to a file named `Main.java`, then compile with `javac Main.java`, and run with `java Main`.

When you input `1234567876`, this program should output `-27` as in the sample test case. However, please note that printing `-27` seems to be a mistake in the expected output you specified. The correct output according to the algorithm should be the minimum absolute difference between any three consecutive digits and the number 753, which would not be a negative number. Therefore, the expected output should be a positive integer. Please check the expected output for correctness.
