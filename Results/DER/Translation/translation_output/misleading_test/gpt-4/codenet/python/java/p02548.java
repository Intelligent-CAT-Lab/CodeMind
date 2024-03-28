Certainly! Below is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt += 1;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
```

If you run the Java program and input `3` as in your test case, it will produce `-43` as the output (although not sure why this is expected as the logic in the provided code should output `4`). The example you've given for Python doesn't quite align with the expected output since for input `3`, the Python program will output `4`, not `-43`. If `-43` is actually the expected output, then there might be an error in the original example or the expected outcome. The Java program provided here will produce the same output as the Python code for any given `n`.
