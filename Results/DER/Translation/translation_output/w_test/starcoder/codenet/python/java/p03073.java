<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
000

Expected output:
1


```
import sys
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def II(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
sys.setrecursionlimit(10**7)
INF = 10 ** 18
MOD = 10 ** 9 + 7
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def SI(): return input()
YN = lambda b: print('YES') if b else print('NO')
yn = lambda b: print('Yes') if b else print('No')

S = SI().strip()

N = len(S)

zero_start = 0
zero_start_counter = 0
for i in range(N):
    if not zero_start == int(S[i]):
        zero_start_counter += 1
    zero_start = (zero_start+1)%2

one_start_counter = N - zero_start_counter

print(min(zero_start_counter, one_start_counter))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < n; i++) {
            if (zero_start!= Integer.parseInt(s.charAt(i) + "")) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }
        int one_start_counter = n - zero_start_counter;
        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}
```
'''
<|endoftext|>
