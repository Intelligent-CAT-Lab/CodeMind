<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

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
This is the equivalent Python code for the given Java code. The `get_num` function is the same as the `getNum` function in the Java code, and it takes two integers `a` and `b` as input and returns their sum. The `if __name__ == '__main__':` block is used to run the code only when the file is executed as a script, and it reads the input from `sys.stdin` and splits it into two integers `a` and `b` using the `split()` method. Finally, it calls the `get_num` function with the input integers and prints the result.</s>
