Below is the translated Python code to Java:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);
        System.out.println(ans);

        scanner.close();
    }
}
```

Ensure you have all the necessary imports, and then you can test this Java code with the test input provided. The expected output should be `39`.
