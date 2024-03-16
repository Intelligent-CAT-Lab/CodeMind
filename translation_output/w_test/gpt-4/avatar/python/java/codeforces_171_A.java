```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        System.out.println(a + b);
    }
}
```

Above is the translated Java code. To use this code, you can compile and run the `Main` class, providing it with the test input:

Test input:
```
35005211 521595368
```

Expected output:
```
898600336
```

Note that for very large numbers, the Java implementation may need to use `long` or even `BigInteger` instead of `int` to avoid overflow. However, in this particular test case, the input values are small enough to fit within the range of `int`.
