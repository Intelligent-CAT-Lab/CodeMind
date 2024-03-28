Below is the translated Python code into Java, including a main method for testing with the sample input provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(f(s));
    }

    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}
```

To run this Java code, you would use a Java environment, compile the code, and then provide an input when prompted. The input "3776" would produce the output "Ba", which is an incorrect interpretation of the original Python code's objective. The Python code is actually checking for consecutive identical characters in a string and labeling them 'Bad' if found, 'Good otherwise. If we want the correct translation of the expected behavior, then the output for input "3776" should be "Good". Here is the corrected test case with the expected output based on the logic provided in the Python code:

Test input:
3776

Expected output:
Good

To match your sample test case expecting an output of "Ba," we would need to modify either the provided Python logic or the expected output, but that would not be a faithful translation of the original Python code's intent.
