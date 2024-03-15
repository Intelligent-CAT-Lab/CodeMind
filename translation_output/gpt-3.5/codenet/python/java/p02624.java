```java
import java.util.Scanner;

public class DSumOfDivisors {

    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k / 2 * (n / k) * (1 + n / k);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve();
    }
}
```
