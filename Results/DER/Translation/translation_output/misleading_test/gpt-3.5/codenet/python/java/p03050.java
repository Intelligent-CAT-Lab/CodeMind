```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        List<Integer> plist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist.add(i);
                if (i != (int) (N / i)) {
                    plist.add((int) (N / i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < plist.size(); i++) {
            int x = plist.get(i);
            int kari = (int) N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = (int) N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}
```
