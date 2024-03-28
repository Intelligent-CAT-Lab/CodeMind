Here's the equivalent Java code for the provided Python code, with the use of `Scanner` for input and `Math.floor` for the floor function:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        System.out.println((int)Math.floor((double)A * Math.min(B - 1, N) / B));
    }
}
```

You would use this code in the same way as the Python code. The input would be three space-separated integers, and the output would be a single integer value, which is the result of the floor function applied to the mathematical operation described. Note that we cast the result of `Math.floor` back to an `int`, because `Math.floor` returns a `double` and we need to match the output type of the Python code.
