<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] digits = input.split("");
        int[] pri = new int[3];
        for (int i = 0; i < 3; i++) {
            pri[i] = scanner.nextInt();
        }
        int ans = -1000;
        for (int[] p : Arrays.asList(pri)) {
            int result = 0;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i].equals("(")) {
                    result += expr(p, i + 1);
                } else if (digits[i].equals(")")) {
                    break;
                } else {
                    result += Integer.parseInt(digits[i]);
                }
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    private static int expr(int[] pri, int i) {
        int result = 0;
        while (i < digits.length) {
            if (digits[i].equals("(")) {
                result += expr(pri, i + 1);
            } else if (digits[i].equals(")")) {
                break;
            } else {
                result += Integer.parseInt(digits[i]);
            }
            i++;
        }
        return result;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` and `IntStream` classes to perform various operations on the input. The `expr` method is used to evaluate the expression, and the `main` method is used to print the result.

Note that this code assumes that the input is a string of digits and parentheses, and that the parentheses are balanced. If the input is not in this format, the code may not work correctly.</s>
