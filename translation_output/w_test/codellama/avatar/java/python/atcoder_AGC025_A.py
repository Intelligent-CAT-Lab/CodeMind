<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
9


```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```
[/INST]
```python
import sys

n = sys.stdin.readline().strip()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += ord(n[j]) - ord('0')
        print(sum)
        return

if n[0] == '1':
    print(10)
    return

print(ord(n[0]) - ord('0'))
```
Note: In Python, the `ord()` function returns the ASCII code of a character, and the `chr()` function returns the character corresponding to an ASCII code. In this solution, we use `ord()` to convert the characters in the input string to ASCII codes, and then subtract the ASCII code of '0' (which is 48) to get the corresponding integer values.</s>
