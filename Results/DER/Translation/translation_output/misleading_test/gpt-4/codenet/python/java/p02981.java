Here is the Java equivalent of the given Python code, assuming that the input is provided via standard input (e.g., using a Scanner object):

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = (n * a > b) ? b : n * a;

        System.out.println(ans);

        scanner.close();
    }
}
```

You would run this Java program and provide the same test input "4 2 9" to get the expected output of "10".
