<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 3

Expected output:
12.389552719678193

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += d / N + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}
```
'''
<|endoftext|>
