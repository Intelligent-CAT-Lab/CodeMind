<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static List<String> tokens = new ArrayList<>();
    static int cur = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                tokens.add(String.valueOf(c));
            }
        }
        tokens.add("");
        int[] ans = parseFormula();
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] parseFormula() {
        return parseOr();
    }

    static int[] parseOr() {
        int[] lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parseOr();
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parseAnd() {
        int[] lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("unexpected token");
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into tokens, and then parses the formula. The result is printed to the console.<｜end▁of▁sentence｜>
