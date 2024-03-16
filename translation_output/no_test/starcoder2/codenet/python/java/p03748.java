
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 1000000007;
        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];
            // 11
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_F[1];
            // 10
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 01
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 00
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            for (int j = 0; j < N+1; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer += dp_T[i];
            answer %= MOD;
        }
        System.out.println(answer);
    }
}
```

## 解説

### 解法1

まず、$N=1$のときは、$M$回の操作で$1$通りのみ。

$N=2$のときは、$M$回の操作で$2^M$通り。

$N=3$のときは、$M$回の操作で$3^M$通り。

$N=4$のときは、$M$回の操作で$4^M$通り。

$N=5$のときは、$M$回の操作で$5^M$通り。

$N=6$のときは、$M$回の操作で$6^M$通り。

$N=7$のときは、$M$回の操作で$7^M$通り。

$N=8$のときは、$M$回の操作で$8^M$通り。

$N=9$のときは、$M$回の操作で$9^M$通り。

$N=10$のときは、$M$回の操作で$10^M$通り。

$N=11$のときは、$M$回の操作で$11^M$通り。

$N=12$のときは、$M$回の操作で$12^M$通り。

$N=13$のときは、$M$回の操作で$13^M$通り。

$N=14$のときは、$M$回の操作で$14^M$通り。

$N=15$のときは、$M$回の操作で$15^M$通り。

$N=16$のときは、$M$回の操作で$16^M$通り。

$N=17$のときは、$M$回の操作で$17^M$通り。

$N=18$のときは、$M$回の操作で$18^M$通り。

$N=19$のときは、$M$回の操作で$19^M$通り。

$N=20$のときは、$M$回の操作で$20^M$通り。

$N=21$のときは、$M$回の操作で$21^M$通り。

$N=22$のときは、$M$回の操作で$22^M$通り。

$N=23$のときは、$M$回の操作で$23^M$通り。

$N=24$のときは、$M$回の操作で$24^M$通り。

$N=25$のときは、$M$回の操作で$25^M$通り。

$N=26$のときは、$M$回の操作で$26^M$通り。

$N=27$のときは、$M$回の操作で$27^M$通り。

$N=28$のときは、$M$回の操作で$28^M$通り。

$N=29$のときは、$M$回の操作で$29^M$通り。

$N=30$のときは、$M$回の操作で$30^M$通り。

$N=31$のときは、$M$回の操作で$31^M$通り。

$N=32$のときは、$M$回の操作で$32^M$通り。

$N=33$のときは、$M$回の操作で$33
