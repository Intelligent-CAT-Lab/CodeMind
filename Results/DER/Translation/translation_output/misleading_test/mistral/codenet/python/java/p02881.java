<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
-71

```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[2];
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && n / i == n / (i * i)) {
                result[0] = i;
                result[1] = n / i;
                break;
            }
        }

        System.out.println(result[0] + " " + result[1]);
    }
}
```</s>
