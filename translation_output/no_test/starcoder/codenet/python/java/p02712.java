<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

ans = 0
for i in range(1, N + 1):
    if i % 5!= 0 and i % 3!= 0:
        ans += i

print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5!= 0 && i % 3!= 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
