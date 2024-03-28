Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        
        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                if (S.charAt(i) == 'x') {
                    i += 1;
                    c += 1;
                } else if (S.charAt(j) == 'x') {
                    j -= 1;
                    c += 1;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
        scanner.close();
    }
}
```

Please note the following changes made to adapt the Python code to Java:
1. Added import of `Scanner` and the `Main` class to encapsulate the method.
2. Replaced `input()` with the use of `Scanner` to read input from the user.
3. Changed the `print` function to `System.out.println`.
4. Java strings are indexed using the `charAt` method instead of square brackets.
5. Replaced the `sys.exit()` statement with `System.exit(0)`.
6. Enclosed the code in a method called `main` and added the necessary class declaration.
7. Java variable and method names follow camelCase by convention, but for simplicity, I left them unchanged.
8. Enclosed the code in a class `Main`, which is a common practice in Java.
