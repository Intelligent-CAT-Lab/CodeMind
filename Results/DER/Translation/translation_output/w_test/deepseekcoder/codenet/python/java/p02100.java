<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
x^2+3x+2

Expected output:
(x+1)(x+2)


```
S = input()
L = len(S)

cur = 0
P = [0]*6
def expr():
    global cur
    op = "+"
    while 1:
        term(op)
        if cur == L:
            break
        op = S[cur]
        cur += 1 # "+"/"-"

def num():
    global cur
    v = 0
    while cur < L and S[cur] in "0123456789":
        v = 10*v + int(S[cur])
        cur += 1
    return v

def term(op):
    global cur
    k = 1
    if S[cur] != 'x':
        k = num()
    d = 0
    if cur < L and S[cur] == "x":
        cur += 1 # "x"
        d = 1
        if cur < L and S[cur] == '^':
            cur += 1 # "^"
            d = num()
    P[d] = k if op == '+' else -k
expr()

def f(P, x):
    res = 0
    for i in range(6):
        res += P[i]*(x**i)
    return res

d = 5
while P[d] == 0:
    d -= 1

R = []
for x in range(2000, -2001, -1):
    if f(P, x) == 0:
        R.append(x)

print("".join("(x%+d)" % -x for x in R))


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static String S;
    static int L;
    static int cur = 0;
    static int[] P = new int[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next();
        L = S.length();
        expr();
        ArrayList<String> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(String.format("(x%+d)", -x));
            }
        }
        System.out.println(String.join("", R));
    }

    static void expr() {
        while (cur < L) {
            term();
            if (cur == L) {
                break;
            }
            cur++;
        }
    }

    static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + (S.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    static void term() {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++;
                d = num();
            }
        }
        P[d] = k;
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads a string input, parses it into a polynomial, and then finds the roots of the polynomial. The roots are printed in the format "(x+1)", "(x-2)", etc.
<|EOT|>
