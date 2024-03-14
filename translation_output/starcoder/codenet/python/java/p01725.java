<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine() + "$";
        int[] pri = new int[3];
        int[] code = new int[] {1, 2, 3};
        int ans = -1000000000;
        for (int[] p : new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}}) {
            pri[0] = p[0];
            pri[1] = p[1];
            pri[2] = p[2];
            int cur = 0;
            int num = 0;
            int result = 0;
            char op = '+';
            while (cur < S.length()) {
                char c = S.charAt(cur);
                if (c == '(') {
                    cur++;
                    result = expr(0);
                    cur++;
                } else if (c >= '0' && c <= '9') {
                    num = num*10 + (c - '0');
                } else {
                    if (op == '+') {
                        result += num;
                    } else if (op == '-') {
                        result -= num;
                    } else {
                        result *= num;
                    }
                    op = c;
                    num = 0;
                }
                cur++;
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }
    public static int expr(int level) {
        int cur = 0;
        int result = 0;
        char op = '+';
        while (1) {
            if (level == 2) {
                int num = 0;
                while (cur < S.length()) {
                    char c = S.charAt(cur);
                    if (c >= '0' && c <= '9') {
                        num = num*10 + (c - '0');
                    } else {
                        break;
                    }
                    cur++;
                }
                result += num;
            } else {
                result = expr(level+1);
            }
            if (cur >= S.length()) {
                break;
            }
            char c = S.charAt(cur);
            if (c == '+' || c == '-' || c == '*') {
                op = c;
            } else {
                break;
            }
            cur++;
        }
        return result;
    }
}
```
<|endoftext|>
