Here is the equivalent Java code that performs the same operation:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = Math.ceil((double) N / 2) / N;
        System.out.println(result);
    }
}
```

This Java code takes an integer `N` as input from the user, then calculates `-(-N // 2) / N` by using `Math.ceil` which is the equivalent of the Python `//` operator for positive division and rounding up. Since Java does integer division when both operands are integers, we need to cast `N` to `double` before dividing to get a double result. Finally, it prints the result.
