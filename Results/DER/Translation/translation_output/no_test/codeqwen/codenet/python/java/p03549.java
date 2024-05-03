```java
import java.util.*;
import java.lang.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (1 << M));
    }
}
```
