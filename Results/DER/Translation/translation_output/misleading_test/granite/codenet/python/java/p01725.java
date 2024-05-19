System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3-2*3

Expected output:
-45

```
from string import digits
from itertools import product
S = input() + "$"

def parse(pri):
    code = "+-*"

    cur = 0
    def number():
        nonlocal cur
        c = S[cur]
        if c == '(':
            cur += 1 # '('
            v = expr(0)
            cur += 1 # ')'
            return v
        num = 0
        while S[cur] in digits:
            num = 10*num + int(S[cur])
            cur += 1
        return num
    def expr(level):
        nonlocal cur
        op = '+'
        result = 0
        while 1:
            if level == 2:
                v = number()
            else:
                v = expr(level+1)
            if op == '+':
                result += v
            elif op == '-':
                result -= v
            else:
                result *= v
            c = S[cur]
            if code.find(c) == -1 or pri[code.index(c)]!= level:
                break
            op = c
            cur += 1
        return result
    return expr(0)
ans = -10**30
for pri in product(range(3), repeat=3):
    ans = max(ans, parse(pri))
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine() + "$";
        int ans = -100000000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int[] pri = {i, j, k};
                    ans = Math.max(ans, parse(S, pri));
                }
            }
        }
        System.out.println(ans);
    }

    public static int parse(String S, int[] pri) {
        String code = "+-*" + "*";
        int cur = 0;
        int result = 0;
        while (cur < S.length()) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++; // '('
                int v = expr(S, pri, 0);
                cur++; // ')'
                result += v;
            } else if (c == '+' || c == '-' || c == '*') {
                result += expr(S, pri, code.indexOf(c));
            } else {
                break;
            }
        }
        return result;
    }

    public static int expr(String S, int[] pri, int level) {
        int cur = 0;
        char op = '+';
        int result = 0;
        while (cur < S.length()) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++; // '('
                int v = expr(S, pri, level + 1);
                cur++; // ')'
                if (op == '+') {
                    result += v;
                } else if (op == '-') {
                    result -= v;
                } else {
                    result *= v;
                }
            } else if (c == '+' || c == '-' || c == '*') {
                if (pri[code.indexOf(c)] == level) {
                    if (op == '+') {
                        result += expr(S, pri, level + 1);
                    } else if (op == '-') {
                        result -= expr(S, pri, level + 1);
                    } else {
                        result *= expr(S, pri, level + 1);
                    }
                    op = c;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return result;
    }
}
```<|endoftext|>
