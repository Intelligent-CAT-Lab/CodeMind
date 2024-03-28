<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 20 5

Expected output:
49

```
from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/(g*g));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
```

'''
<|endoftext|>
