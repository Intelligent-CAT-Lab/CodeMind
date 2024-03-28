Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        
        ans += 1 * Math.min(a, k);
        k -= Math.min(a, k);
        
        // The next line has no effect since it is multiplying by 0, so it can be omitted
        // ans += 0 * Math.min(b, k);
        
        k -= Math.min(b, k);
        
        ans += (-1) * Math.min(c, k);
        k -= Math.min(c, k);
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

In this Java code, I used the `Scanner` class for input and the `Math.min` method for comparing two values. Note that the line that multiplies by 0 has been effectively omitted since it has no impact on the result (`ans += 0 * Math.min(b, k);`).
