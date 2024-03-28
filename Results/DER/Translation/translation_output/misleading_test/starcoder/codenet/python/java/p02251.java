<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
25

```
n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int x : new int[]{25, 10, 5, 1}) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
```

'''
<|endoftext|>
