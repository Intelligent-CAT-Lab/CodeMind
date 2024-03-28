Here is the translated Java code that provides the same functionality as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;

        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans += 1;
                // System.out.println(i);
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

You can compile and run the Java program, provide the input "15 40" when prompted, and you should see the expected output "10".
