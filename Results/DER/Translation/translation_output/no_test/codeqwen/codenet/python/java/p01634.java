Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (Character.isDigit(c)) {
                    m += 1;
                }
                if (Character.isLowerCase(c)) {
                    n += 1;
                }
                if (Character.isUpperCase(c)) {
                    l += 1;
                }
            }
            if (m == 0 || n == 0 || l == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if its length is less than 6, and if so, prints "INVALID". If the length is 6 or more, it checks if the string contains at least one digit, one lowercase letter, and one uppercase letter. If it does, it prints "VALID". If it doesn't, it prints "INVALID".
