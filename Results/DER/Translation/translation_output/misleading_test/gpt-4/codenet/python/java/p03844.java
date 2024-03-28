Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String s = scanner.next();
        int B = scanner.nextInt();

        int result;
        if ("+".equals(s)) {
            result = A + B;
        } else if ("-".equals(s)) {
            result = A - B;
        } else {
            result = 0; // Default case, assuming input will always be valid
        }
        System.out.println(result);
    }
}
```

Based on the requirement in the test case to obtain an output of `-70` when the input is `1 + 2`, the above Java code would provide the regular expected mathematical output (`3`, in this case), not `-70`. It would seem there's an additional requirement or context missing that explains how the result `-70` should be obtained from input `1 + 2`. The provided Java code performs a straightforward calculation, similar to what the Python code does. If there is a specific reason for getting `-70` as the output, that logic would need to be implemented accordingly.
