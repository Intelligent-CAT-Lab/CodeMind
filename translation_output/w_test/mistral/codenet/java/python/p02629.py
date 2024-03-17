<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
b


```
import java.util.Scanner;

public class p02629 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long x;
        long y;
        char[] out = new char[11];  // 1000000000000001 <= 26^10ã¨ã¡ãã£ã¨ãããï¼ãªã®ã§11æ¡

        for (int i = 0; i < 11; i++) {
            N = N - 1;  // 
            x = N / 26;
            y = N % 26;
            out[i] = (char) ('a' + y);
            if (x == 0) {
                break;
            }
            N = x;
        }

        for (int i = 10; i >= 0; i--) {
            if (out[i] == Character.MIN_VALUE) {
                continue;
            }
            System.out.print(out[i]);
        }
    }
}
```
[/INST]
```python
N = int(input())
out = ['a' for _ in range(11)]

for i in range(11):
    N -= 1
    x = N // 26
    y = N % 26
    out[i] = chr(y + ord('a'))
    if x == 0:
        break
    N = x

for i in range(10, -1, -1):
    if out[i] == ord('a'):
        continue
    print(out[i], end='')
```</s>
