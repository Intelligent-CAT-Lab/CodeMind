```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = 0;

        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) (Math.pow(n / k, 3) + Math.pow((n + k / 2) / k, 3));
        }

        System.out.println(ans);
    }
}
```
