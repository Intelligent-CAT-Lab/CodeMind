Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int i = 1; i < Math.pow(10, 5); i++) {
            if ((360 * i) % x == 0) {
                System.out.println((360 * i) / x);
                break;
            }
        }
        scanner.close();
    }
}
```

To use this program, run it and provide the value `90` (as per your test case) when prompted for input, and it should output `4`, as expected.
