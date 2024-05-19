System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k % 2 == 1) {
            ans = (long)Math.pow(n / k, 3);
        } else {
            ans = (long)Math.pow(n / k, 3) + (long)Math.pow((n + k / 2) / k, 3);
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
