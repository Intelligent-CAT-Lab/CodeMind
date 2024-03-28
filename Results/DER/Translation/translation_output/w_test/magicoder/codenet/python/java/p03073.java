<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().strip();
        int N = S.length();

        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (zeroStart != Character.getNumericValue(S.charAt(i))) {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }

        int oneStartCounter = N - zeroStartCounter;

        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of changes needed to make the string start with either 0 or 1, and then prints the minimum of these two counts.<｜end▁of▁sentence｜>
