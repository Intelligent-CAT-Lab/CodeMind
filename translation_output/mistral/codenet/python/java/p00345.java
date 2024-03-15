<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
public class Main {
    public static int gcd(int x, int y) {
        return gcd(y, x % y) == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = p - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), 10 ** d);
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), 10 ** d - 10 ** l);
        }
    }
}
```</s>
