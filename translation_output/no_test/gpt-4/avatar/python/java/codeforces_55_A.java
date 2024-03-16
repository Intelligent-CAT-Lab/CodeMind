Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n % 2 == 0) {
            n /= 2;
        }

        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

Please note that in Java, we need to use a `Scanner` to get input from the user, and we also use `System.out.println` for output. Additionally, a `main` method is required, which is the entry point to a Java application, and typically everything is encapsulated within a class, in this case, I have named it `Main`. Another important thing to notice is the `scanner.close()` at the end of the `main` method to close the `Scanner` after it has been used.

