<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

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
        int ret = (s.contains("7") && s.contains("5") && s.contains("3")) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, and then it uses a depth-first search to count the number of strings of digits that contain the digits 7, 5, and 3 and are less than or equal to the input number. The result is printed to the standard output.
<|EOT|>
