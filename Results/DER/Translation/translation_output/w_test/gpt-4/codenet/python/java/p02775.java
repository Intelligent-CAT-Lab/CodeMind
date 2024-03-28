The following is the Java version of the given Python code. The input and output are handled a bit differently in Java. In Java, we typically use a `Scanner` object for input and `System.out` methods for output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int[] n = new int[input.length() + 1];
        for (int i = 0; i < input.length(); i++) {
            n[i] = Character.getNumericValue(input.charAt(input.length() - 1 - i));
        }

        int s = 0;
        int res = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int k = n[i] + s;
            if (k < 5 || (k == 5 && n[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);

        scanner.close();
    }
}
```

This Java code snippet replicates the functionality of the provided Python code. It reads an integer input as a string, reverses it, and then processes it as described. Note that in Java, you typically need to close the `Scanner` object to prevent resource leaks.
