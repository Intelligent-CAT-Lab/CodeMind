Here is the translation of the provided Python code to Java. I've added an appropriate class and the `main` method, given that you are inputting a value programmatically (in this case, `64`). If you want to take input from the user, you could use a `Scanner` or other input methods in Java.

```java
public class Main {
    public static void main(String[] args) {
        // Test input
        int N = 64;

        // Check if N is even and print the result
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double) (N + 1) / N / 2);
        }
    }
}
```

Please note that in Java, you need to cast one of the operands to `double` to ensure floating-point division. If you use integer division, the result will not be the same as in Python. In this code, `(double) (N + 1)` ensures the entire calculation uses floating-point arithmetic.
