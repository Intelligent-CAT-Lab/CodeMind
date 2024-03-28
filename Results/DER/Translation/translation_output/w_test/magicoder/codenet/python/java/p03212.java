<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int n;

    static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) == -1) {
                ret = 0;
                break;
            }
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then it uses a depth-first search (DFS) to count the number of strings that consist of the digits '7', '5', and '3' and are less than or equal to the input number. The DFS function is recursive, and it adds the current string to the next recursive call. If the current string is greater than the input number, it returns 0. If all digits '7', '5', and '3' are present in the current string, it returns 1, otherwise it returns 0. The main function reads the input number and prints the result of the DFS function.<｜end▁of▁sentence｜>
