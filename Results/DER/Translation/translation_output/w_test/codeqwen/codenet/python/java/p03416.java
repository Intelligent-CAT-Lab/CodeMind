Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = Integer.toString(i);
            String reversedStr = new StringBuilder(str).reverse().toString();
            if (str.equals(reversedStr)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then iterates over all integers from the first to the second (inclusive). For each integer, it converts it to a string, reverses the string, and checks if the original string is equal to the reversed string. If they are equal, it increments a counter. Finally, it prints the counter, which is the number of palindromic integers in the range.
