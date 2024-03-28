<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 10

Expected output:
-95

```
a, b = map(int, input().split())
total = 1
ans = 0

while total < b:
    ans += 1
    total += a-1

print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 1;
        int ans = 0;
        while (total < b) {
            ans += 1;
            total += a - 1;
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
