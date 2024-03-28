Below is the translation of the provided Python code to Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading the input number
        int k = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("ACL");
        }

        // Printing the resulting string
        System.out.println(sb.toString());
    }
}
```

This Java code sets up a buffer to read from the standard input, reads an integer `k`, and uses a `StringBuilder` to create and print the string consisting of `k` repetitions of "ACL". Remember to run this in an environment where you can provide input to the standard input stream if you're testing it interactively.
