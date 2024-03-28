Here's the Python code translated into Java:

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
        
        int minA = Math.min(a, k);
        ans += 1 * minA;
        k -= minA;

        int minB = Math.min(b, k);
        // ans += 0 * minB; // This line can be omitted since it does not change the ans value.
        k -= minB;

        int minC = Math.min(c, k);
        ans += (-1) * minC;
        k -= minC;

        System.out.println(ans);
        
        scanner.close();
    }
}
```

Please note that in the second part where we add zeros times the minimum of `b` and `k`, the code doesn't actually change the value of `ans`. Therefore, I've commented it out to demonstrate that it's not necessary. However, to be a direct translation, it's included but commented for clarity. Java requires this is to be more explicit about types and variable declarations than Python, and you also need a `Scanner` object for input.
