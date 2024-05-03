Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String a = inputs[0];
        String b = inputs[1];
        String c = inputs[2];

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three strings from the user, checks if the last character of the first string is the same as the first character of the second string, and if the last character of the second string is the same as the first character of the third string. If all three conditions are met, it prints "YES", otherwise it prints "NO".
