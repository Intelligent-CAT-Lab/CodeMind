<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
509

```
import java.util.*;
class p00378{
    void solve(){
        int A, B, X, ans;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        X = sc.nextInt();

        if ( X % 500 != 0 ) X += 500 - X%500;
        int a = 0;
        int b = 0;

        if ( A < B ) {
            a = X/1000 + ((X%1000>0)?1:0);
        } else if ( A > 2*B ){
            b = X/500;
        } else {
            a = X/1000; X %= 1000;
            b = X/500;
        }

        System.out.println(A*a + B*b);
    }

    public static void main(String[] args){ new p00378().solve(); }
}


```
[/INST]
```python
import sys

def solve():
    A, B, X = map(int, sys.stdin.readline().split())

    if X % 500 != 0:
        X += 500 - X % 500

    a = 0
    b = 0

    if A < B:
        a = X // 1000 + (X % 1000 > 0)
    elif A > 2 * B:
        b = X // 500
    else:
        a = X // 1000
        X %= 1000
        b = X // 500

    print(A * a + B * b)


if __name__ == "__main__":
    solve()
```
Note: The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into a list of strings, and the `map()` function is used to convert the list of strings to a list of integers. The `if __name__ == "__main__":` block is used to execute the `solve()` function only if the script is run as the main program.</s>
