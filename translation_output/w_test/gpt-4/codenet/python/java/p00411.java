Here's the translation of your Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```

When you input "180 120 90", the program will output "60.000000".
