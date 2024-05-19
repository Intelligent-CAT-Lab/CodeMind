System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 10

Expected output:
-33

```
def inpl(): return list(map(int, input().split()))
N, M = inpl()

n2 = N * 1
n1 = N * 1
m1 = M * 1
mall = M * 2

# ãããã»ãã¼ã
ans1 = 0
while True:
    mall -= n1
    m1 = -(-mall//2)
    
    if mall <= 0:
        break
    ans1 += 1
    
    if n2 - m1 >= 0:
        n2 -= m1
    else:
        n1 = n1 + n2 - m1
        n2 = 0
    if n1 <= 0:

        break
    ans1 += 1

# ushiãæ»ã¼ã

ans2 = 0
n2 = N * 1
n1 = N * 1
m1 = M * 1
m2 = M * 1
mall = M * 2
nall = N * 2

while True:
    if m2 - n1 >= 0:
        m2 -= n1
    else:
        m1 = m1 + m2 - n1
        m2 = 0
    if m1 <= 0:

        break
    ans2 += 1

    nall -= m1
    n1 = -(-nall//2)
    
    if nall <= 0:
        break
    ans2 += 1

print(min(ans1, ans2))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans1 = 0;
        int n2 = N;
        int n1 = N;
        int m1 = M;
        int mall = M * 2;
        while (mall > 0) {
            mall -= n1;
            m1 = (mall + 1) / 2;
            if (mall <= 0) {
                break;
            }
            ans1 += 1;
            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1 += 1;
        }
        int ans2 = 0;
        n2 = N;
        n1 = N;
        m1 = M;
        int m2 = M;
        int nall = N * 2;
        while (nall > 0) {
            if (m2 - n1 >= 0) {
                m2 -= n1;
            } else {
                m1 = m1 + m2 - n1;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2 += 1;
            nall -= m1;
            n1 = (nall + 1) / 2;
            if (nall <= 0) {
                break;
            }
            ans2 += 1;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}
```<|endoftext|>
