<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
460


```
A, B, X = map(int, input().split())
k = (X // 1000)
ans = k * min(A, 2*B)
r = X - 1000*k
if 0 < r <= 500:
    ans += min(A, B)
elif 500 < r:
    ans += min(A, 2*B)
print(ans)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int k = X / 1000;
        int ans = k * Math.min(A, 2*B);
        int r = X - 1000*k;
        if (r <= 500) {
            ans += Math.min(A, B);
        } else if (r > 500) {
            ans += Math.min(A, 2*B);
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
