Here is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class PasswordValidator {
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
                if (c >= '0' && c <= '9') {
                    m++;
                }
                if (c >= 'a' && c <= 'z') {
                    n++;
                }
                if (c >= 'A' && c <= 'Z') {
                    l++;
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

Please note that in Java, we need to import the Scanner class to read input from the user, and characters are checked against their own char literals instead of using their ASCII values as you would with the `ord` function in Python. Also, the program is encapsulated within a class and a main method, which is the entry point of Java applications.
