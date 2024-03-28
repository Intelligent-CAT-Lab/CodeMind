Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
        scanner.close();
    }
}
```

When providing an input of `3`, the expected output would indeed be `99`, as the condition in the `else` block would double the input value of `3` to produce `6`. If `99` were expected, the Python code should be different (the Java translation above assumes the Python code is as you provided). If the expected output of `99` for an input of `3` is not a typo, please provide the correct Python logic or the expected output for the stated Python code. The Java code has been written to give equivalent results to the Python code.
