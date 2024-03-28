Certainly! Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N - (K - 1));
        scanner.close();
    }
}
```

To run this code, you can compile it using `javac Main.java` and then execute it with `java Main`. You'll then input `3 2`, which will give the expected output `82`, just as it would in the Python version. However, the expected output for this case with the input `3 2` should actually be `2` because `3 - (2 - 1)` equals `2`, not `82`. If there was a typo in the expected output, please correct it to see the appropriate results.
