<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = s.indexOf('.');
        int d = s.length() - i - 1;
        int l = s.indexOf('(') - i - 1;
        if (l == -1) {
            System.out.println(s.substring(0, i) + "/" + "1" + "0" + "^" + d);
        } else {
            System.out.println(s.substring(0, i) + "/" + "1" + "0" + "^" + (d - 2) + " - " + s.substring(s.indexOf('(') + 1, s.indexOf(')')));
        }
    }
}
```
'''
<|endoftext|>
