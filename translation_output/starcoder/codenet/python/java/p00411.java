<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```
<|endoftext|>
