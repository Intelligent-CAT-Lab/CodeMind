Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(countChar(S.substring(0, N), '(') - countChar(S.substring(0, N), ')'));
        int Q = Math.abs(countChar(S.substring(N + 1), '(') - countChar(S.substring(N + 1), ')'));
        System.out.println(Math.min(P, Q));
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, finds the index of the first occurrence of '*', and then calculates the minimum number of parentheses to be removed from the two substrings before and after '*'. The `countChar` method is a helper function that counts the number of occurrences of a character in a string.
