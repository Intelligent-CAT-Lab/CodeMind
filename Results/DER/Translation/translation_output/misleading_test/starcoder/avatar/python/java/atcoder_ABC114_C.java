<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8307

```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7', '5', '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            int ans = 0;
            if (i > 9) {
                ans = dp[i - 1];
            } else {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    ans = dp[i - 1];
                }
            }
            for (int j = 0; j < 3; j++) {
                int num = i + j * 7;
                if (num > N) {
                    break;
                }
                ans += dp[num];
            }
            dp[i] = ans;
        }
        System.out.println(dp[N]);
    }
}
```
<|endoftext|>
