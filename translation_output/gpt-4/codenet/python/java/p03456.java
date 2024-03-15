Here is the equivalent Java code for the provided Python program:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = reader.readLine().split(" ");
            String concatenated = input[0] + input[1];
            int n = Integer.parseInt(concatenated);
            int sqrtn = (int) Math.sqrt(n);

            boolean foundPerfectSquare = false;

            for (int i = 1; i <= sqrtn; i++) {
                if (i * i == n) {
                    System.out.println("Yes");
                    foundPerfectSquare = true;
                    break;
                }
            }

            if (!foundPerfectSquare) {
                System.out.println("No");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

This Java code uses `BufferedReader` to read from the standard input, which is similar to `sys.stdin.readline()` in Python. In Java, when reading from the standard input, you have to handle possible `IOExceptions`, so there is a `try-catch` block in the code.

Also, note that there is no direct equivalent to Python's "for-else" construct in Java. Instead, we use a boolean flag to determine whether a perfect square was found during the loop. If it wasn't, then we print "No" after the loop ends.
