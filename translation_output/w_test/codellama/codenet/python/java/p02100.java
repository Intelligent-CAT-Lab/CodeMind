<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        int cur = 0;
        int[] P = new int[6];

        expr(input, length, cur, P);

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

        System.out.println(R.stream().map(x -> "(x" + (x < 0 ? "-" : "+") + Math.abs(x) + ")").collect(Collectors.joining()));
    }

    private static void expr(String input, int length, int cur, int[] P) {
        String op = "+";
        while (cur < length) {
            term(input, length, cur, P, op);
            if (cur == length) {
                break;
            }
            op = input.substring(cur, cur + 1);
            cur++; // "+"/"-"
        }
    }

    private static int num(String input, int cur) {
        int v = 0;
        while (cur < length && input.charAt(cur) in "0123456789") {
            v = 10 * v + Integer.parseInt(input.substring(cur, cur + 1));
            cur++;
        }
        return v;
    }

    private static void term(String input, int length, int cur, int[] P, String op) {
        int k = 1;
        if (input.charAt(cur) != 'x') {
            k = num(input, cur);
        }
        int d = 0;
        if (cur < length && input.charAt(cur) == "x") {
            cur++; // "x"
            d = 1;
            if (cur < length && input.charAt(cur) == '^') {
                cur++; // "^"
                d = num(input, cur);
            }
        }
        P[d] = k if op == '+' else -k;
    }

    private static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}
```
Note that this code is not optimized and may not be the most efficient way to solve the problem. It is just a translation of the Python code to Java.</s>
