Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int cnt = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'W' characters, and then calculates the sum of the indices of all 'W' characters. The result is then printed to the console.
