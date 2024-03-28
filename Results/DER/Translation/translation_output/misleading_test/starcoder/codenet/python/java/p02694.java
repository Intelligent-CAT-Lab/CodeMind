<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
103

Expected output:
62

```
import math
x = int(input())

y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 100;
        int ans = 0;
        while (y < x) {
            ans++;
            y = (int) Math.floor(y * 1.01);
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
