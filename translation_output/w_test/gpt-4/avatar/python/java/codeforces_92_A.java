Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int ans = 0;

        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

To run this Java code, you would use a Java compiler to compile the `Main` class, and then you would execute the Java application. You would provide the input (`24 7440`) to the program either through a console input when prompted or by redirecting input from a file to the program. The program would then output the expected result (`9`).
