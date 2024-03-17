<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
460


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

@@ Response
```python
def solve():
    A, B, X = map(int, input().split())

    if X % 500 != 0:
        X += 500 - X % 500

    a = 0
    b = 0

    if A < B:
        a = X // 1000 + ((X % 1000 > 0) * 1)
    elif A > 2 * B:
        b = X // 500
    else:
        a = X // 1000
        X %= 1000
        b = X // 500

    print(A * a + B * b)

solve()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the value of `a` and `b`, and then prints the result of the expression `A*a + B*b`.<｜end▁of▁sentence｜>
