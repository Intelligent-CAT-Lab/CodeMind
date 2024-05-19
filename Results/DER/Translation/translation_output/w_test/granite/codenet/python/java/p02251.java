System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4


```
n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        ans += n / 25;
        n %= 25;
        ans += n / 10;
        n %= 10;
        ans += n / 5;
        n %= 5;
        ans += n;
        System.out.println(ans);
    }
}
```

Test input:
100

Expected output:
4<|endoftext|>
