<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
            if code.find(c) == -1 or pri[code.index(c)] != level:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine() + "$";

        int ans = -1000000000;
        for (int[] pri : product(new int[] { 0, 1, 2 }, repeat = 3)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }

    public static int parse(int[] pri) {
        String code = "+-*";
        int cur = 0;
        int num = 0;
        int result = 0;
        while (cur < S.length()) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++;
                int v = expr(0);
                cur++;
                return v;
            }
            while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
                num = 10 * num + (S.charAt(cur) - '0');
                cur++;
            }
            result += num;
            int op = code.indexOf(c);
            if (op == -1 || pri[op] != cur) {
                break;
            }
            cur++;
        }
        return result;
    }

    public static int expr(int level) {
        int result = 0;
        while (true) {
            int v = number();
            if (level == 1) {
                return v;
            }
            int op = '+';
            while (true) {
                int c = level == 2 ? v : expr(level + 1);
                if (op == '+') {
                    result += c;
                } else if (op == '-') {
                    result -= c;
                } else {
                    result *= c;
                }
                char c = S.charAt(cur);
                if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                    break;
                }
                cur++;
                op = c;
            }
            return result;
        }
    }

    public static int number() {
        int cur = 0;
        int num = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            num = 10 * num + (S.charAt(cur) - '0');
            cur++;
        }
        return num;
    }

    public static List<int[]> product(int[] a, int repeat) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            result.add(Arrays.copyOf(a, a.length));
        }
        return result;
    }

    public static String code = "+-*";
}
```</s>
