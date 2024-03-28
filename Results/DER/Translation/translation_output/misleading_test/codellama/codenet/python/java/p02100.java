<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        int cur = 0;
        int[] P = new int[6];

        while (cur < length) {
            char op = input.charAt(cur);
            cur++;
            if (op == '+') {
                term(op, P);
            } else if (op == '-') {
                term(op, P);
            }
        }

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        int[] R = new int[2000];
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R[x] = x;
            }
        }

        for (int x : R) {
            System.out.print("(x" + x + ")");
        }
    }

    public static void term(char op, int[] P) {
        int k = 1;
        if (op == '+') {
            k = num(P);
        } else if (op == '-') {
            k = -num(P);
        }
        int d = 0;
        if (P[cur] == 'x') {
            cur++;
            d = 1;
            if (P[cur] == '^') {
                cur++;
                d = num(P);
            }
        }
        P[d] = k;
    }

    public static int num(int[] P) {
        int v = 0;
        while (cur < length && P[cur] in "0123456789") {
            v = 10 * v + Integer.parseInt(P[cur]);
            cur++;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (x ** i);
        }
        return res;
    }
}
```
This is the Java code for the given Python code. I have used the `Scanner` class to read the input from the user and the `String` class to manipulate the input string. The `term` function is used to parse the input string and extract the coefficients and exponents of the polynomial. The `num` function is used to extract the numerical value of a coefficient or exponent. The `f` function is used to evaluate the polynomial at a given point. The `main` function is the entry point of the program and it reads the input from the user, parses the input string, and evaluates the polynomial at the given point.

Note that this code is not optimized and it can be improved in terms of performance and readability. Also, this code assumes that the input string is a valid polynomial expression, if the input string is not a valid polynomial expression, it will throw a `NumberFormatException` or `IndexOutOfBoundsException`.</s>
