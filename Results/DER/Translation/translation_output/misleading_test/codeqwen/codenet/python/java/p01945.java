Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(countChar(s.substring(0, n), '(') - countChar(s.substring(0, n), ')'));
        int q = Math.abs(countChar(s.substring(n + 1), '(') - countChar(s.substring(n + 1), ')'));
        System.out.println(Math.min(p, q));
    }

    private static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, finds the index of the first '*', and then counts the number of '(' and ')' characters before and after the '*'. It then calculates the absolute difference between the number of '(' and ')' characters before and after the '*', and prints the minimum of these two differences.
