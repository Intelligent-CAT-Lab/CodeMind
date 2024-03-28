Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3-2*3

Expected output:
3


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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine() + "$";
        int ans = -1000000000;
        for (int[] pri : new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}}) {
            int cur = 0;
            int level = 0;
            int result = 0;
            while (cur < S.length()) {
                char c = S.charAt(cur);
                if (c == '(') {
                    cur++; // '('
                    level++;
                    result = Math.max(result, expr(level, pri));
                    cur++; // ')'
                } else if (c == '+' || c == '-' || c == '*') {
                    if (level == 2) {
                        result = Math.max(result, number());
                    } else {
                        result = Math.max(result, expr(level+1, pri));
                    }
                    if (c == '+') {
                        result += number();
                    } else if (c == '-') {
                        result -= number();
                    } else {
                        result *= number();
                    }
                    level = 0;
                } else if (Character.isDigit(c)) {
                    int num = c - '0';
                    cur++;
                    while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
                        num = num * 10 + (S.charAt(cur) - '0');
                        cur++;
                    }
                    result = Math.max(result, num);
                }
                cur++;
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    public static int expr(int level, int[] pri) {
        int cur = 0;
        int op = '+';
        int result = 0;
        while (level > 0) {
            if (level == 2) {
                result = Math.max(result, number());
            } else {
                result = Math.max(result, expr(level+1, pri));
            }
            if (op == '+') {
                result += number();
            } else if (op == '-') {
                result -= number();
            } else {
                result *= number();
            }
            op = pri[cur];
            cur = (cur + 1) % 3;
            level--;
        }
        return result;
    }

    public static int number() {
        int cur = 0;
        int num = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            num = num * 10 + (S.charAt(cur) - '0');
            cur++;
        }
        return num;
    }
}
```<|endoftext|>
