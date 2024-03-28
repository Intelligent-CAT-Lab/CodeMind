<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ar;dabcda}cdabcd}bcsaWcd5bcda=cdabcdabc`aOcdab4dabodabcdafcdabcwabcdabcdabcdabgdabud[bcdabAdaocd2bkd

```
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println('a');
        } else if (n == 2) {
            System.out.println("ab");
        } else if (n == 3) {
            System.out.println("abc");
        } else {
            for (int i = 0; i < n / 4; i++) {
                System.out.print("abcd");
            }
            int t = n % 4;
            if (t == 1) {
                System.out.println('a');
            } else if (t == 2) {
                System.out.println("ab");
            } else if (t == 3) {
                System.out.println("abc");
            }
        }
    }
}
```
[/INST]
```python
import sys

n = int(sys.stdin.readline().strip())

if n == 1:
    print('a')
elif n == 2:
    print("ab")
elif n == 3:
    print("abc")
else:
    for i in range(n // 4):
        print("abcd")
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print("ab")
    elif t == 3:
        print("abc")
```
Explanation:

The code first reads an integer `n` from standard input using `sys.stdin.readline().strip()`.

Then, it checks if `n` is equal to 1, 2, or 3, and prints the corresponding string if it is.

If `n` is not equal to 1, 2, or 3, it prints "abcd" `n // 4` times, where `n // 4` is the integer division of `n` by 4.

Finally, it checks if `n % 4` is equal to 1, 2, or 3, and prints the corresponding string if it is.

Note that the code uses the `print()` function instead of `System.out.println()` in Java, and it uses the `strip()` method to remove any trailing newline characters from the input string.</s>
