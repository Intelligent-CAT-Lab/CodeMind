<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n1 = N;
        int n2 = N;
        int m1 = M;
        int m2 = M;
        int ans1 = 0;
        int ans2 = 0;
        while (true) {
            if (m2 - n1 >= 0) {
                m2 -= n1;
            } else {
                m1 = m1 + m2 - n1;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans1++;
            n2 -= m1;
            if (n2 <= 0) {
                n1 = n1 + n2;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1++;
        }
        while (true) {
            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans2++;
            m2 -= n1;
            if (m2 <= 0) {
                m1 = m1 + m2;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2++;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}
```
<|endoftext|>
