Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two strings from the user, checks if the first string is "H", and if it is, it prints the second string. If the first string is not "H", it checks if the second string is "H", and if it is, it prints "D". If the second string is not "H", it prints "H".
