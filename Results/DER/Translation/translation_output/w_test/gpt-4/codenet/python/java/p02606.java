Here is the Java equivalent code for the provided Python code:

```java
import java.util.Scanner;

public class DivideRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;

        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

When you run this Java program, you should input the values as in the test case (5 10 2) to get the expected output (3).
