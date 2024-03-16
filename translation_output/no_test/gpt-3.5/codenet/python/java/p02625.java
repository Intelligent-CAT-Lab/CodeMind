```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] d = new int[n + 1];
        for (int i = 0; i < n; i++) {
            d[i + 1] = ((m - i) * ((m - n + i) * d[i] + i * d[Math.max(0, i - 1)] * (m - i + 1))) % 1000000007;
        }
        System.out.println(d[n]);
    }
}
```
