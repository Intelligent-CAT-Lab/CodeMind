Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        List<String> tokens = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c!='') {
                tokens.add(Character.toString(c));
            }
        }
        tokens.add(""); // EOF
        int cur = 0;
        int[] ans = parse_formula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse_formula(List<String> tokens, int cur) {
        return parse_or(tokens, cur);
    }

    public static int[] parse_or(List<String> tokens, int cur) {
        int[] lhs = parse_and(tokens, cur);
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parse_or(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_and(List<String> tokens, int cur) {
        int[] lhs = parse_term(tokens, cur);
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parse_and(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_term(List<String> tokens, int cur) {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parse_or(tokens, cur);
            if (!tokens.get(cur).equals(")")) {
                throw new Exception("not closed");
            }
            cur++;
            return res;
        }
        throw new Exception("unknown token");
    }
}
```<|endoftext|>
