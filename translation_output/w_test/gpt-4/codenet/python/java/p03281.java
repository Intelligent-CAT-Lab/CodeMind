```java
import java.util.Scanner;

public class DivisorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (cntDivisor(j) == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }

    public static int cntDivisor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
```

Now let's try it with the test input `105`.

Expected output:
```
1
```
