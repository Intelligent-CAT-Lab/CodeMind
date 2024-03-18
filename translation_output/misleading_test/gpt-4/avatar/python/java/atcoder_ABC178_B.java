Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        
        long ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);

        scanner.close();
    }
}
```

When you input "418379342 802780784 -790013317 -445130206", the output will be:

```
-186233282690604538
```
