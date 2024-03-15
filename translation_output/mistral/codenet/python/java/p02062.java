<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.ArrayList;
import java.util.List;

public class FormulaParser {
    private List<String> tokens;
    private int cur;

    public static void main(String[] args) {
        String input = "2 + 3 & 4 | 5";
        FormulaParser parser = new FormulaParser(input);
        List<Integer> result = parser.parseFormula();
        System.out.println(result.get(0) + " " + result.get(1));
    }

    public FormulaParser(String input) {
        this.tokens = new ArrayList<>(input.split("\\s+"));
        this.cur = 0;
    }

    public List<Integer> parseFormula() {
        return parseOr();
    }

    private List<Integer> parseOr() {
        List<Integer> lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur++;
            List<Integer> rhs = parseOr();
            int zero = lhs.get(0) + rhs.get(0);
            int one = Math.min(lhs.get(1), lhs.get(0) + rhs.get(1));
            return List.of(zero, one);
        }
        return lhs;
    }

    private List<Integer> parseAnd() {
        List<Integer> lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur++;
            List<Integer> rhs = parseAnd();
            int zero = Math.min(lhs.get(0), lhs.get(1) + rhs.get(0));
            int one = lhs.get(1) + rhs.get(1);
            return List.of(zero, one);
        }
        return lhs;
    }

    private List<Integer> parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            // debug(cur, 1)
            return List.of(1, 1);
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            // debug(cur, "or")
            List<Integer> res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new Exception("not closed");
            }
            cur++;
            // debug(cur)
            return res;
        }
        throw new Exception("Invalid token: " + tokens.get(cur));
    }
}
```</s>
