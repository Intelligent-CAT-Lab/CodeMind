```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ant = 1;
        long bnt = 1;
        long cnt = 1;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % 1000000007;
            bnt = (9 * bnt) % 1000000007;
            cnt = (8 * cnt) % 1000000007;
        }

        long ans = (ant - (bnt * 2 - cnt)) % 1000000007;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```
