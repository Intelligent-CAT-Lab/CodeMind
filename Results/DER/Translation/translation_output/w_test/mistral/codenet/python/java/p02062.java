<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?&?|?&?|?&?

Expected output:
3 2


```
# from inspect import currentframe
# from sys import exit, stderr


# debug function
# def debug(*args):
#     names = {id(v):k for k,v in currentframe().f_back.f_locals.items()}
#     print(', '.join(names.get(id(arg),'???') + str(id(arg)) +' = '+repr(arg) for arg in args), file=stderr)


src = list(str(input()))
tokens = [tok for tok in src if tok != " "]
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
        if tokens[cur] != ")":
            raise Exception("not closed")
        cur += 1
        # debug(cur)
        return res
ans = parse_formula()
print(ans[0], ans[1])
# debug(cur)
# print(len(tokens))


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        // System.out.println(Arrays.toString(tokens));
        int len = tokens.length;
        int[] ans = parseFormula(tokens, len);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(String[] tokens, int len) {
        int[] lhs = parseAnd(tokens, len);
        int[] rhs = parseOr(tokens, len);
        int zero = lhs[0] + rhs[0];
        int one = Math.min(lhs[1], lhs[0] + rhs[1]);
        return new int[]{zero, one};
    }

    public static int[] parseAnd(String[] tokens, int len) {
        int[] lhs = parseTerm(tokens, len);
        int[] rhs = parseAnd(tokens, len);
        int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
        int one = lhs[1] + rhs[1];
        return new int[]{zero, one};
    }

    public static int[] parseOr(String[] tokens, int len) {
        int[] lhs = parseAnd(tokens, len);
        int[] rhs = parseOr(tokens, len);
        int zero = lhs[0] + rhs[0];
        int one = Math.min(lhs[1], lhs[0] + rhs[1]);
        return new int[]{zero, one};
    }

    public static int[] parseTerm(String[] tokens, int len) {
        if (tokens[len - 1].equals("?")) {
            return new int[]{1, 1};
        } else if (tokens[len - 1].equals("(")) {
            int[] res = parseOr(tokens, len);
            if (!tokens[len - 2].equals(")")) {
                throw new Exception("not closed");
            }
            return res;
        }
        return null;
    }
}
```</s>
