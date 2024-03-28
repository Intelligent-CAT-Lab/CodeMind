<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

### Input

```
4 10 10
```

### Output

```
1.000000
```

### Explanation

```
a = 4
t = 10
r = 10

ans = r * t / a
ans = 10 * 10 / 4
ans = 100 / 4
ans = 25

print("{:.6f}".format(ans))

```

### Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, t, r;
        a = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        double ans = r * t / a;
        System.out.println("{:.6f}".format(ans));
    }
}
```
</s>
