<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
<>>

Expected output:
-25

```
from sys import stdin
S = str(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

n = len(S)+1
sho = [0]*n
dai = [0]*n

for i,s in enumerate(S):
    i += 1
    if s ==">":
        sho[i] = 0
    else:
        sho[i] = sho[i-1] + 1

for i,s in enumerate(S[::-1]):
    i = n-i-2
    if s == "<":
        dai[i]=0
    else:
        dai[i] = dai[i+1] +1

seq = [max(x,y) for x,y in zip(sho,dai)]

print(sum(seq))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(S.length() - i - 1);
            if (s == '<') {
                dai[n - i - 2] = 0;
            } else {
                dai[n - i - 2] = dai[n - i - 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int x : seq) {
            sum += x;
        }

        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads a string `S` from the standard input, then it calculates two arrays `sho` and `dai` based on the string `S`. The `sho` array represents the number of consecutive '>' characters from the left to the right of each character in `S`, and the `dai` array represents the number of consecutive '<' characters from the right to the left of each character in `S`. The final result is the sum of the maximum values from `sho` and `dai` at each index.
<|EOT|>
