Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

Remember to import `java.util.Scanner` to read from standard input, and close the `scanner` object after you're done using it to prevent resource leaks. This code reads three integers from the standard input, the same as the Python code, and then sets the value of `ans` to "Yes" if any two of the numbers add up to the third. It then prints the value of `ans`.
