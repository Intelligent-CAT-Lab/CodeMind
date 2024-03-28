<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
11

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }
        System.out.println(ans);
    }
}
```

'''
<|endoftext|>
