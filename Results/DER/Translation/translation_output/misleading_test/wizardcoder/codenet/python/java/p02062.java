Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        List<Character> tokens = new ArrayList<>();
        for (char c : chars) {
            if (c!='') {
                tokens.add(c);
            }
        }
        tokens.add(' ');
        int cur = 0;
        int[] ans = parseFormula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(List<Character> tokens, int cur) {
        return parseOr(tokens, cur);
    }

    public static int[] parseOr(List<Character> tokens, int cur) {
        int[] lhs = parseAnd(tokens, cur);
        if (tokens.get(cur) == '|') {
            cur++;
            int[] rhs = parseOr(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(List<Character> tokens, int cur) {
        int[] lhs = parseTerm(tokens, cur);
        if (tokens.get(cur) == '&') {
            cur++;
            int[] rhs = parseAnd(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(List<Character> tokens, int cur) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur) == '(') {
            cur++;
            int[] res = parseOr(tokens, cur);
            if (tokens.get(cur)!= ')') {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("unknown token");
    }
}
```<|endoftext|>
