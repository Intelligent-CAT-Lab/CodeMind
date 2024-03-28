Here's the Java translation of the given Python code:

```java
import java.util.Scanner;

public class StringMismatchCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length() - 1;
        int ans = 0;
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans += 1;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program includes the necessary imports and wraps your code in a class and a `main` method. An instance of `Scanner` is used to read the input from the user, and the `charAt` method is used to access characters at specific indices of the string. Finally, the result is printed using `System.out.println()`.

To run this code, simply compile the `StringMismatchCounter` class and execute it. When prompted, input the test string (for example "redcoder"), and the program will output the expected number (which is 1, not 91 as in your test case description, assuming it's a typo since the Python code computes the number of mismatches). If "91" was expected based on other criteria not reflected in the Python code, then the provided code may not match your test outcome. However, this Java code matches the logic of the provided Python example.
