<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int n2 = N * 1;
        int n1 = N * 1;
        int m1 = M * 1;
        int mall = M * 2;

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

        int ans2 = 0;
        n2 = N * 1;
        n1 = N * 1;
        m1 = M * 1;
        m2 = M * 1;
        mall = M * 2;
        nall = N * 2;

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
```
Note that the Java code uses the `Math.min()` method to find the minimum of two numbers, which is equivalent to the Python code's `min()` function.</s>
