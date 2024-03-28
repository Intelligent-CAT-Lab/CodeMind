<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0.(3)

Expected output:
1/3


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
[/INST]
```java
import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int o = input.indexOf('.');
        int p = input.indexOf('(');
        int d = input.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                o = i;
            } else if (input.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (input.charAt(i) != ')') {
                all += input.charAt(i);
            }
        }
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
```
This code takes a string as input, and then it finds the index of the decimal point and the opening parenthesis. It then calculates the denominator and the numerator of the fraction, and then it prints the fraction in the format of "numerator/denominator".

The `gcd` function is used to calculate the greatest common divisor of two integers, which is used to simplify the fraction.

The `printV` function is used to print the fraction in the format of "numerator/denominator".

The `main` function is the entry point of the program, it takes a string as input, and then it calls the `printV` function to print the fraction.

Note that this code is not optimized, and it can be improved by using more efficient algorithms and data structures.</s>
