Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
    elif S[i]!= ')':
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int o = S.indexOf('.');
        int p = S.indexOf('(');
        int d = S.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        if (p == -1) {
            int num = Integer.parseInt(S.substring(0, o));
            int den = (int) Math.pow(10, d);
            printV(num, den);
        } else {
            all = S.substring(0, o);
            sub = S.substring(p, S.length());
            d -= 2; // for ()
            int num = Integer.parseInt(all) - Integer.parseInt(sub);
            int den = (int) Math.pow(10, d) - (int) Math.pow(10, l);
            printV(num, den);
        }
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x/g + "/" + y/g);
    }

    public static int gcd(int x, int y) {
        return y == 0? x : gcd(y, x % y);
    }
}
```<|endoftext|>
