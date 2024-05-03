Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
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

This Java code does the same thing as your Python code. It reads a password from the user, checks if it's length is less than 6, and if not, it checks if the password contains at least one digit, one lowercase letter, and one uppercase letter. If it does, it prints "VALID", otherwise it prints "INVALID".
