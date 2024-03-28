```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }

        System.out.println(ans);
    }

    public static int dsum(int x) {
        int sum = 0;
        String xStr = String.valueOf(x);
        for (int i = 0; i < xStr.length(); i++) {
            sum += Character.getNumericValue(xStr.charAt(i));
        }
        return sum;
    }
}
```
