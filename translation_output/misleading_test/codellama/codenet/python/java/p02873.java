<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
```
This code reads a string from the standard input, and then calculates the sum of the maximum number of consecutive characters that are either '>' or '<' in the string.

The code first initializes two arrays `sho` and `dai` to store the number of consecutive '>' and '<' characters, respectively, from the beginning of the string to the current position. The arrays are initialized with 0s, and the values are updated as the string is processed.

The code then calculates the maximum number of consecutive characters that are either '>' or '<' in the string, by taking the maximum of the values in the `sho` and `dai` arrays.

Finally, the code calculates the sum of the maximum number of consecutive characters that are either '>' or '<' in the string, and prints the result.

Note that the code assumes that the input string only contains '>' and '<' characters, and does not handle any other characters.</s>
