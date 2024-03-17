<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int cur = 0;
    static int[] P = new int[6];
    static String S;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        expr();
        int d = 5;
        while (P[d] == 0) {
            d--;
        }
        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x > -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }
        for (int x : R) {
            System.out.print("(x" + (x < 0 ? x : "+" + x) + ")");
        }
    }

    static void expr() {
        String op = "+";
        while (true) {
            term(op);
            if (cur == S.length()) {
                break;
            }
            op = S.substring(cur, cur + 1);
            cur++;
        }
    }

    static int num() {
        int v = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    static void term(String op) {
        int k = 1;
        if (!S.substring(cur, cur + 1).equals("x")) {
            k = num();
        }
        int d = 0;
        if (cur < S.length() && S.substring(cur, cur + 1).equals("x")) {
            cur++;
            d = 1;
            if (cur < S.length() && S.substring(cur, cur + 1).equals("^")) {
                cur++;
                d = num();
            }
        }
        P[d] = op.equals("+") ? k : -k;
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

This Java code does the same thing as the Python code. It reads a string from the standard input, parses it into a polynomial, and then prints the roots of the polynomial.<｜end▁of▁sentence｜>
