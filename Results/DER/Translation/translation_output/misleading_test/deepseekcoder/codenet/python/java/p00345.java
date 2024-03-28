<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0.(3)

Expected output:
^a3

```
def gcd(x, y):
    return gcd(y, x%y) if y else x

def printV(x, y):
    g = gcd(x, y)
    print(str(x//g) + "/" +  str(y//g))

S = input()
all = ""
sub = ""
p = -1

for i in range(len(S)):
    if S[i] == '.':
        o = i
    elif S[i] == '(':
        p = i
        sub = all
    elif S[i] != ')':
        all += S[i]

d = len(S) - o - 1
l = p - o - 1
if p == -1:
    printV(int(all), 10**d)
else:
    d -= 2 # for ()
    printV(int(all) - int(sub), 10**d - 10**l)


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String all = "";
        String sub = "";
        int p = -1;
        int o = -1;
        int l = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
                l = o;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2;
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println((x / g) + "/" + (y / g));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, finds the greatest common divisor of two numbers, and prints the result in the form of a fraction. The input string can contain a decimal point and parentheses, which are used to specify a subtotal.
<|EOT|>
