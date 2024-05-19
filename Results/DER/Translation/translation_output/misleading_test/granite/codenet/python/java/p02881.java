System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = (int)Math.sqrt(n); i > 0; i--) {
            if (n % i == 0) {
                sum += i + n/i;
            }
        }
        System.out.println(sum - 2);
    }
}
```

Test input:
```
10
```

Expected output:
```
-71
```<|endoftext|>
