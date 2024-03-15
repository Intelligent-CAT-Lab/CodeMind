Below is the translated Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < 25 && !found; i++) {
            for (int j = 0; j < 20 && !found; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Make sure to place this code inside a file named `Main.java` and compile & run it using your preferred Java environment. This will ensure you can input a value for `N` just like it's asked for in the Python code.
