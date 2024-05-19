System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    N = int(sys.stdin.readline())
    x, y = divmod(N - 1, 26)
    out = []
    while x > 0:
        out.append(chr(ord('a') + y))
        x, y = divmod(x - 1, 26)
    out.append(chr(ord('a') + y))
    print(''.join(reversed(out)))

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    (2, 'b'),
    (27, 'aa'),
    (703, 'zzy'),
    (704, 'aaa'),
]
for N, expected_output in test_inputs:
    actual_output = io_capture(main, N)
    assert actual_output == expected_output, f'Expected {expected_output}, got {actual_output}'
```<|endoftext|>
