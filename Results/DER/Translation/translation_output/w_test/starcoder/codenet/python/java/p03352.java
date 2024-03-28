<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
9


```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;
        for (int b = 0; b < x; b++) {
            for (int p = 2; p < x; p++) {
                if (b ** p <= x) {
                    ans = Math.max(ans, b ** p);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
