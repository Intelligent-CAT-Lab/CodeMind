Here's the equivalent Java code for the provided Python script:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine().trim();

        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
```

This Java program behaves similarly to the Python code: it reads a string from `stdin`, calculates two sequences based on the conditions specified by the characters in the input string, and then computes the sum of the maximum values from the corresponding indices of the two sequences.

A brief explanation of differences between the Java and Python version:
- Java requires a lot of boilerplate, such as defining a class and method to contain the main program logic.
- I/O in Java is more verbose; we're using a `BufferedReader` to read from `stdin`.
- Array initialization and manipulation are more explicit in Java.
- The `print` call in Python corresponds to `System.out.println` in Java.
