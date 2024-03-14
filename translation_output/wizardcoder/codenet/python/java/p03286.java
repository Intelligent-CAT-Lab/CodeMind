Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import product
def main():
    N = int(input())
    if N == 0:
        return 0
    l = set()
    while N!= 0:
        if N > 0:
            r = plus(N)
            l.add(r)
            N -= pow(2, r)
        else:
            r = minus(N)
            l.add(r)
            N += pow(2, r)
    s = [0] * (max(l)+1)
    for i in range(max(l)+1):
        if i in l:
            s[i] = 1
    s.reverse()
    return ''.join(str(i) for i in s)
    #for i in product(range(2), repeat=9):
    #    r = 0
    #    for j, v in enumerate(i):
    #        r += v * pow(-2, j)
    #    l.append((r, i))
    #l.sort()
    #for x in l:
    #    print(x)
def plus(N):
    p = 0
    n = 0
    while True:
        p += pow(2, n)
        if p >= N:
            break
        n += 2
    return n
def minus(N):
    p = 0
    n = 1
    while True:
        p -= pow(2, n)
        if p <= N:
            break
        n += 2
    return n

print(main())

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        Set<Integer> l = new HashSet<>();
        while (N!= 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += Math.pow(2, r);
            }
        }
        int[] s = new int[l.size()];
        int i = 0;
        for (int j : l) {
            s[i++] = j;
        }
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (int j : s) {
            sb.append(j);
        }
        System.out.println(sb.toString());
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}
```<|endoftext|>
