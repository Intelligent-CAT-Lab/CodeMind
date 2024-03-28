<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    static String S;
    static int L;
    static int[] P = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        L = S.length();

        int cur = 0;
        expr();

        System.out.println(f(P, -1));
    }

    public static void expr() {
        int op = 1;
        while (1) {
            term(op);
            if (cur == L) {
                break;
            }
            op = (op == 1) ? 2 : 1;
        }
    }

    public static void num() {
        int v = 0;
        int cur = 0;
        while (cur < L && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
            v = 10 * v + (S.charAt(cur) - '0');
            cur++;
        }
        P[0] = v;
    }

    public static void term(int op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            num();
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
        P[d] = k * (op == 1 ? 1 : -1);
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }

    public static List<Integer> solve(int[] P, int x) {
        List<Integer> R = new ArrayList<>();
        for (int i = 2000; i >= -2001; i--) {
            if (f(P, i) == 0) {
                R.add(i);
            }
        }
        return R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        L = S.length();

        int cur = 0;
        expr();

        List<Integer> R = solve(P, -1);
        System.out.println(R);
    }
}
```</s>
