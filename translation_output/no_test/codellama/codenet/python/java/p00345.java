<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class GCD {
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
            printV(Integer.parseInt(all), 10**d);
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), 10**d - 10**l);
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
Note that the `gcd` function is implemented using the recursive approach, and the `printV` function is used to print the result in the desired format. The `main` function reads the input from the user, parses it, and calls the `printV` function to print the result.</s>
