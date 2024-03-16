<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int n2 = N * 1;
        int n1 = N * 1;
        int m1 = M * 1;
        int mall = M * 2;

        // ãããã»ãã¼ã
        int ans1 = 0;
        while (true) {
            mall -= n1;
            m1 = -(-mall / 2);

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

        // ushiãæ»ã¼ã
        int ans2 = 0;
        n2 = N * 1;
        n1 = N * 1;
        m1 = M * 1;
        int m2 = M * 1;
        mall = M * 2;
        int nall = N * 2;

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
            ans2 += 1;

            nall -= m1;
            n1 = -(-nall / 2);

            if (nall <= 0) {
                break;
            }
            ans2 += 1;
        }

        System.out.println(Math.min(ans1, ans2));
    }
}
```<｜end▁of▁sentence｜>
