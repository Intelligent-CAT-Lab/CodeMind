```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] result = ij((int) Math.sqrt(n), n);

        int sum = result[0] + result[1] - 2;
        System.out.println(sum);
    }

    public static int[] ij(int x, int n) {
        for (int i = x; i >= 1; i--) {
            if (n%i == 0) {
                return new int[]{i, n/i};
            }
        }
        return new int[]{0, 0};
    }
}
```
