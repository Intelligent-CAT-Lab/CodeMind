System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ACM

Expected output:
71

```
from itertools import permutations
base = "=+-*()01"
s = input()
l = len(s)
mapping = {}
counter = {}
cnt = 0
for c in s:
    if c in base:
        continue
    if c not in mapping:
        mapping[c] = cnt
        cnt += 1
    v = mapping[c]
    counter[v] = counter.get(v, 0) + 1
if cnt > 8:
    print(0)
    exit(0)

def solve(read):
    cur = failed = 0
    def next():
        nonlocal cur
        cur += 1
    def error():
        nonlocal failed
        failed = 1
    def number():
        res = 0
        if read(cur) not in "01":
            error()
        first = 1
        while 1:
            c = read(cur)
            if c not in "01":
                break
            if not first and res == 0:
                error()
            res = (res << 1) ^ int(c)
            next() # "0" or "1"
            first = 0
        return res
    def factor():
        c = read(cur)
        if c == "-":
            next() # "-"
            return -factor()
        elif c == "(":
            next() # "("
            val = expr()
            if read(cur)!= ")":
                error()
            next() # ")"
            return val
        return number()
    def term():
        res = 1
        while 1:
            res *= factor()
            c = read(cur)
            if c!= "*":
                break
            next() # "*"
        return res
    def expr():
        res = 0
        op = "+"
        while 1:
            if op == "+":
                res += term()
            else:
                res -= term()
            c = read(cur)
            if c not in "+-":
                break
            next() # "+" or "-"
            op = c
        return res
    if sum(read(i) == "=" for i in range(l))!= 1:
        return 0
    lv = expr()
    next() # "="
    rv = expr()
    if not failed and cur == l:
        return lv == rv
    return 0

def get(b):
    def read(cur):
        if l <= cur:
            return "$"
        if s[cur] in base:
            return s[cur]
        return b[mapping[s[cur]]]
    return read

ans = 0
for b in permutations(base, cnt):
    ans += solve(get(b))
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String base = "=+-*()01";
        int cnt = 0;
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (base.indexOf(c)!= -1) {
                continue;
            }
            if (!mapping.containsKey(c)) {
                mapping.put(c, cnt);
                cnt++;
            }
            int v = mapping.get(c);
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int i = 0; i < base.length(); i++) {
            for (int j = i + 1; j < base.length(); j++) {
                for (int k = j + 1; k < base.length(); k++) {
                    for (int m = k + 1; m < base.length(); m++) {
                        for (int n = m + 1; n < base.length(); n++) {
                            for (int o = n + 1; o < base.length(); o++) {
                                for (int p = o + 1; p < base.length(); p++) {
                                    char[] b = new char[cnt];
                                    b[mapping.get('=')] = base.charAt(i);
                                    b[mapping.get('+')] = base.charAt(j);
                                    b[mapping.get('-')] = base.charAt(k);
                                    b[mapping.get('*')] = base.charAt(m);
                                    b[mapping.get('(')] = base.charAt(n);
                                    b[mapping.get(')')] = base.charAt(o);
                                    b[mapping.get('0')] = base.charAt(p);
                                    ans += solve(s, b);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int solve(String s, char[] b) {
        int l = s.length();
        int cur = 0;
        int failed = 0;
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '=') {
                cnt++;
            }
        }
        if (cnt!= 1) {
            return 0;
        }
        int lv = expr(s, b, cur, failed);
        if (failed!= 0 || cur!= l) {
            return 0;
        }
        if (s.charAt(cur)!= '=') {
            return 0;
        }
        cur++;
        int rv = expr(s, b, cur, failed);
        if (failed!= 0 || cur!= l) {
            return 0;
        }
        return lv == rv? 1 : 0;
    }

    private static int expr(String s, char[] b, int cur, int failed) {
        int res = 0;
        int op = '+';
        while (cur < s.length()) {
            if (op == '+') {
                res += term(s, b, cur, failed);
            } else {
                res -= term(s, b, cur, failed);
            }
            if (cur >= s.length()) {
                break;
            }
            char c = s.charAt(cur);
            if (c!= '+' && c!= '-') {
                break;
            }
            cur++;
            op = c;
        }
        return res;
    }

    private static int term(String s, char[] b, int cur, int failed) {
        int res = 1;
        while (cur < s.length()) {
            char c = s.charAt(cur);
            if (c!= '*' && c!= '(') {
                break;
            }
            if (c == '(') {
                res *= expr(s, b, cur + 1, failed);
                if (failed!= 0 || s.charAt(cur)!= '(') {
                    return 0;
                }
                cur++;
                if (cur >= s.length() || s.charAt(cur)!= ')') {
                    failed = 1;
                    return 0;
                }
                cur++;
            } else {
                res *= factor(s, b, cur, failed);
                if (failed!= 0) {
                    return 0;
                }
            }
        }
        return res;
    }

    private static int factor(String s, char[] b, int cur, int failed) {
        char c = s.charAt(cur);
        if (c == '-') {
            cur++;
            return -factor(s, b, cur, failed);
        } else if (c == '(') {
            cur++;
            int res = expr(s, b, cur, failed);
            if (failed!= 0 || s.charAt(cur)!= ')') {
                return 0;
            }
            cur++;
            return res;
        } else {
            return number(s, b, cur, failed);
        }
    }

    private static int number(String s, char[] b, int cur, int failed) {
        int res = 0;
        if (s.charAt(cur)!= '0' && s.charAt(cur)!= '1') {
            failed = 1;
            return 0;
        }
        int first = 1;
        while (cur < s.length()) {
            char c = s.charAt(cur);
            if (c!= '0' && c!= '1') {
                break;
            }
            if (!first && res == 0) {
                failed = 1;
                return 0;
            }
            res = (res << 1) ^ (c - '0');
            cur++;
            first = 0;
        }
        return res;
    }
}
```<|endoftext|>
