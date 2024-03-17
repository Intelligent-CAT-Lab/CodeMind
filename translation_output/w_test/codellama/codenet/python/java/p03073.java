<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.length();
        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (input.charAt(i) != '0') {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }
        int oneStartCounter = N - zeroStartCounter;
        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}
```
This code reads a string from standard input, and then calculates the minimum number of consecutive 0s or 1s that need to be changed to make the string balanced. It does this by iterating over the string and keeping track of the number of consecutive 0s or 1s that have been encountered. When a character that is not a 0 or 1 is encountered, the counter is incremented and the zeroStart variable is updated. The final result is the minimum of the two counters, which represents the minimum number of consecutive 0s or 1s that need to be changed to make the string balanced.</s>
