Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int ans = 0;
        int a = 0;
        int i = 0;

        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (i + 1 < S.length() && S.charAt(i) == 'B' && S.charAt(i + 1) == 'C') {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program will have the same functionality as the Python code you provided. Note that in Java, you have to import the Scanner class for taking input and declare the main class and method before writing your logic. After the logic is complete, we close the Scanner object to avoid any resource leaks.

You can place this code in a file named `Main.java` and compile and run it for the provided test input. It should produce the expected output:

Test input:
ABCABC

Expected output:
3
