<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600302

```
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = getNum(a, b);
        System.out.println(ans);
    }

    public static int getNum(int a, int b) {
        int reverseB = 0;
        while (b > 0) {
            reverseB = reverseB * 10 + b % 10;
            b /= 10;
        }
        return a + reverseB;
    }
}
```
[/INST]
```python
import sys

def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    print(get_num(a, b))
```
This is the Python code that translates the given Java code. The `get_num` function is the same as the `getNum` function in the Java code, and it takes two integers as input and returns their sum. The `if __name__ == '__main__':` block is used to run the code only when the file is executed as a script, and it reads the input from `sys.stdin` and splits it into two integers using the `split()` method. The `get_num` function is then called with the two integers as input, and the result is printed to the console.</s>
