Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int K = countChar(a, 'K');
        int U = countChar(a, 'U');
        int P = countChar(a, 'P');
        int C = countChar(a, 'C');
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
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

This Java code does the same thing as your Python code. It reads a string from the user, counts the occurrences of 'K', 'U', 'P', and 'C', and then prints the minimum of these counts. The `countChar` function is a helper function that counts the occurrences of a character in a string.
