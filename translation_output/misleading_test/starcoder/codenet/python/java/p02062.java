<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?&?|?&?|?&?

Expected output:
3 2 -98

```
# from inspect import currentframe
# from sys import exit, stderr


# debug function
# def debug(*args):
#     names = {id(v):k for k,v in currentframe().f_back.f_locals.items()}
#     print(', '.join(names.get(id(arg),'???') + str(id(arg)) +' = '+repr(arg) for arg in args), file=stderr)


src = list(str(input()))
tokens = [tok for tok in src if tok!= " "]
# debug(tokens)

# "" as EOF
tokens.append("")
cur = 0
def parse_formula():
    return parse_or()

def parse_or():
    global cur
    lhs = parse_and()
    if tokens[cur] == "|":
        cur += 1
        rhs = parse_or()
        zero = lhs[0] + rhs[0]
        one = min(lhs[1], lhs[0] + rhs[1])
        return (zero, one)
    return lhs

def parse_and():
    global cur
    lhs = parse_term()
    if tokens[cur] == "&":
        cur += 1
        rhs = parse_and()
        zero = min(lhs[0], lhs[1] + rhs[0])
        one = lhs[1] + rhs[1]
        return (zero, one)
    return lhs

def parse_term():
    global cur
    if tokens[cur] == "?":
        cur += 1
        # debug(cur, 1)
        return [1, 1]
    elif tokens[cur] == "(":
        cur += 1
        # debug(cur, "or")
        res = parse_or()
        if tokens[cur]!= ")":
            raise Exception("not closed")
        cur += 1
        # debug(cur)
        return res
ans = parse_formula()
print(ans[0], ans[1])
# debug(cur)
# print(len(tokens))


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int cur = 0;
        int[] ans = parse(s, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse(String s, int cur) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        while (cur < s.length()) {
            if (s.charAt(cur) == '?') {
                res[0]++;
                res[1]++;
                cur++;
            } else if (s.charAt(cur) == '|') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] += rhs[0];
                res[1] = Math.min(res[1], rhs[0] + rhs[1]);
            } else if (s.charAt(cur) == '&') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] = Math.min(res[0], rhs[0]);
                res[1] += rhs[1];
            } else if (s.charAt(cur) == '(') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] = Math.min(res[0], rhs[0]);
                res[1] = Math.min(res[1], rhs[1]);
                if (s.charAt(cur)!= ')') {
                    throw new Exception("not closed");
                }
                cur++;
            }
        }
        return res;
    }
}
```

'''
<|endoftext|>
