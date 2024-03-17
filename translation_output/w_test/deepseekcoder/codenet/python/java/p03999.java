<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```

s = input()

ans = 0
for i in range(2 ** (len(s) - 1)):
    pat = s[0]
    index = 1
    for j in range(len(s) - 1):
        if i >> j & 1:
            pat += "+"
        pat += s[index]
        index += 1
    #print(pat)
    ans += eval(pat)

print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
            String pat = String.valueOf(s.charAt(0));
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index += 1;
            }
            ans += calculate(pat);
        }
        System.out.println(ans);
    }

    private static int calculate(String s) {
        String[] split = s.split("\\+");
        int sum = 0;
        for (String str : split) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads a string of digits, generates all possible expressions by inserting "+" between the digits, evaluates each expression, and sums up the results. The `calculate` method is used to evaluate the expressions.
<|EOT|>
