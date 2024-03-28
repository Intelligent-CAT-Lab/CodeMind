Here's the equivalent Java code for the provided Python script:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGenerator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = generateStrings(n);
        for (String s : ans) {
            System.out.println(s);
        }
        scanner.close();
    }

    private static List<String> f(String s) {
        int m = (int)maxChar(s) - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char)(i + 97));
        }
        return res;
    }

    private static List<String> generateStrings(int n) {
        if (n == 1) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("a");
            return baseCase;
        }
        else {
            List<String> ans = new ArrayList<>();
            for (String k : generateStrings(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    private static char maxChar(String s) {
        char maxChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
}
```

This Java program does what the Python script is intended to do: It reads an integer from the user and then generates and prints a pattern of strings based on that integer. In the Java program, I've used `ArrayList` to handle dynamic arrays (similar to Python's lists) and `Scanner` to read input from the user. Each function from the original Python code has a corresponding method in the Java code.
