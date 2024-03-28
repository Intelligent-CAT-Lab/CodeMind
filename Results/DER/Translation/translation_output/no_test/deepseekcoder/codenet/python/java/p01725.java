<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    static String S;
    static int cur;
    static String code = "+-*";
    static int[] pri;

    static int number() {
        char c = S.charAt(cur);
        if (c == '(') {
            cur += 1;
            int v = expr(0);
            cur += 1;
            return v;
        }
        int num = 0;
        while (Character.isDigit(S.charAt(cur))) {
            num = 10 * num + (S.charAt(cur) - '0');
            cur += 1;
        }
        return num;
    }

    static int expr(int level) {
        char op = '+';
        int result = 0;
        while (true) {
            int v;
            if (level == 2) {
                v = number();
            } else {
                v = expr(level + 1);
            }
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            op = c;
            cur += 1;
        }
        return result;
    }

    static int parse(int[] pri) {
        cur = 0;
        return expr(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next() + "$";
        int ans = -1000000000;
        for (pri = new int[]{0, 1, 2}; pri[0] < 3; pri = nextPermutation(pri)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }

    static int[] nextPermutation(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                for (int j = array.length - 1; j >= i; j--) {
                    if (array[j] > array[i - 1]) {
                        int temp = array[i - 1];
                        array[i - 1] = array[j];
                        array[j] = temp;
                        Arrays.sort(array, i, array.length);
                        return array;
                    }
                }
            }
        }
        return new int[]{};
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then it calculates the maximum result of the expression by trying all possible permutations of the operator priorities. The `nextPermutation` function is used to generate all possible permutations of the operator priorities.
<|EOT|>
