System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
x^2+3x+2

Expected output:
5[+wt(xPE\

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
    if S[cur]!= 'x':
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];
        expr(S, cur, P);

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        System.out.println(R.stream()
           .map(x -> "(x%+" + (-x) + "d)")
           .collect(Collectors.joining()));
    }

    public static void expr(String S, int cur, int[] P) {
        String op = "+";
        while (true) {
            term(S, cur, P, op);
            if (cur == S.length()) {
                break;
            }
            op = S.substring(cur, cur + 1);
            cur += 1; // "+"/"-"
        }
    }

    public static void term(String S, int cur, int[] P, String op) {
        int k = 1;
        if (!S.substring(cur, cur + 1).equals("x")) {
            k = num(S, cur);
        }
        int d = 0;
        if (cur < S.length() && S.substring(cur, cur + 1).equals("x")) {
            cur += 1; // "x"
            d = 1;
            if (cur < S.length() && S.substring(cur, cur + 1).equals("^")) {
                cur += 1; // "^"
                d = num(S, cur);
            }
        }
        P[d] = k * (op.equals("+")? 1 : -1);
    }

    public static int num(String S, int cur) {
        int v = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Integer.parseInt(S.substring(cur, cur + 1));
            cur += 1;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}
```<|endoftext|>
