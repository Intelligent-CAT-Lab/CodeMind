Below is the translated code from Python to Java. Please note that in Java, you would need to import the `Scanner` class from the `java.util` package to read input from the user.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int n = s.length() - 1;
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
```
This Java program will read a string input from the user and calculate the number of characters that don't match with their corresponding character from the other end of the string. The result is then printed to the console.
