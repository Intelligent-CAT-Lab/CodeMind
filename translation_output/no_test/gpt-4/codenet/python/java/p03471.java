Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n - i; ++j) {
                int k = n - i - j;
                if (i * 10000 + j * 5000 + k * 1000 == y) {
                    System.out.println(i + " " + j + " " + k);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("-1 -1 -1");
        }
    }
}
```

Please note that for Java, I've added the necessary `import` statement to include the Scanner class for input handling and defined a `Main` class and the `main` method which is the entry point for a Java application. Also, unlike Python's `exit()`, we use `break` to exit the loop, and there's no need to explicitly exit the program as it will finish naturally once the main method execution ends. Java strictly uses static typing, so we need to declare the type of our variables explicitly.
