<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
4


```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
    }

    static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 0;
        if (s.contains("7") && s.contains("5") && s.contains("3")) {
            ret = 1;
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then calls the `dfs` function with the string "0" as the argument. The `dfs` function checks if the current string `s` contains all the characters '7', '5', and '3'. If it does, it increments the `ret` variable by 1. Then it adds the current character to `s` and calls itself recursively. The function returns the total count of such strings.
<|EOT|>
