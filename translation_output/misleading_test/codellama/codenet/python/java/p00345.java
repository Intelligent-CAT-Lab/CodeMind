<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
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
This code first reads the input from the user and then calculates the values of `o`, `p`, `d`, and `l` based on the input. It then iterates through the input string and extracts the values of `all` and `sub` based on the positions of the `.` and `(` characters. Finally, it calls the `printV` method to print the result.

The `printV` method first calculates the greatest common divisor of `x` and `y` using the `gcd` method, and then prints the result in the format `x/y`.

The `gcd` method is a recursive function that calculates the greatest common divisor of two integers using the Euclidean algorithm. It returns the result of the recursive call if `y` is not equal to 0, and returns `x` if `y` is equal to 0.

Note that this code assumes that the input is a valid string that follows the format specified in the problem statement. If the input is not valid, the code may throw an exception or produce incorrect results.</s>
