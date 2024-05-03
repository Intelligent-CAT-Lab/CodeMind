Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count / 2.0));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `Math.round()` function is used to round the result to the nearest integer. The `/ 2.0` is used to ensure that the division is done as a floating-point division, which is necessary to get the correct result.
