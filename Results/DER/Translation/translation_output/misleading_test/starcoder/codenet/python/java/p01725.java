<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + "$";
        int[] pri = new int[3];
        for (int i = 0; i < 3; i++) {
            pri[i] = sc.nextInt();
        }
        int ans = -1000000000;
        for (int[] p : new int[][]{{1, 1, 1}, {1, 1, 2}, {1, 2, 1}, {1, 2, 2}, {2, 1, 1}, {2, 1, 2}, {2, 2, 1}, {2, 2, 2}}) {
            ans = Math.max(ans, parse(s, p));
        }
        System.out.println(ans);
    }

    public static int parse(String s, int[] pri) {
        int[] code = new int[]{'+', '-', '*'};
        int cur = 0;
        int[] num = new int[1];
        int[] result = new int[1];
        int[] op = new int[1];
        num[0] = 0;
        result[0] = 0;
        op[0] = '+';
        while (cur < s.length()) {
            char c = s.charAt(cur);
            if (c == '(') {
                cur++;
                result[0] = expr(0);
                cur++;
            } else {
                while (cur < s.length() && Character.isDigit(s.charAt(cur))) {
                    num[0] = num[0] * 10 + (s.charAt(cur) - '0');
                    cur++;
                }
                result[0] = op[0] == '+'? result[0] + num[0] : op[0] == '-'? result[0] - num[0] : result[0] * num[0];
            }
            c = s.charAt(cur);
            if (code[pri[code.indexOf(c)]]!= c) {
                break;
            }
            op[0] = c;
            cur++;
        }
        return result[0];
    }
}
```
<|endoftext|>
