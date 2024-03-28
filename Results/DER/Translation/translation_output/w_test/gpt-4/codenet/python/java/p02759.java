Here's the equivalent Java code for your Python snippet:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (n + 1) / 2;

        System.out.println(a);

        scanner.close();
    }
}
```

In this Java code, `Scanner` is used to take user input, similar to `input()` in Python. The division and rounding down behavior in Java for integers matches the given Python code, which is why there is no need to explicitly cast the result to `int`. However, if you'd like to make the intention of the code clearer (since Java division with integers already results in an integer), you can cast the result to `int` as shown below:

```java
int a = (int)((n + 1) / 2);
```

Since the division of two integers in Java results in an integer, the explicit casting is not necessary, but it serves as a code documentation to explain that you are expecting an integer result intentionally.
