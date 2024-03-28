Here's the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length() - 1;
        int ans = 0;
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans++;
            }
        }
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

This Java program does the same as the Python code. It reads a string from the user, iterates over half of it, compares characters from opposite ends and if they don't match, increments the answer. Then it prints the answer to the console.
