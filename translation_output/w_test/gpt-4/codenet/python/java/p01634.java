Below is the Java equivalent of the provided Python code, which takes an input string and checks if it's a valid password based on certain criteria:

```java
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        String a = scanner.nextLine();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0; // Digit count
            int n = 0; // Lowercase letter count
            int l = 0; // Uppercase letter count
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    m += 1;
                }
                if (ch >= 'a' && ch <= 'z') {
                    n += 1;
                }
                if (ch >= 'A' && ch <= 'Z') {
                    l += 1;
                }
            }
            if (m == 0 || n == 0 || l == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
        scanner.close();
    }
}
```

To compile and run the Java program, you would do something like this from a command line:

```bash
javac PasswordValidator.java
java PasswordValidator
```

Keep in mind that you'll need to have a JDK (Java Development Kit) installed on your machine to compile and run Java code.
