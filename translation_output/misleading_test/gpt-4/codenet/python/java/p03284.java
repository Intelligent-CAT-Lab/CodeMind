Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(-60);
        }

        scanner.close();
    }
}
```

To test the code in Java, you can compile and run it, then input "7 3" (without quotes) when prompted. It should output `-60` as expected.
