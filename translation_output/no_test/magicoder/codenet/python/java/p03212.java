<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

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

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then it uses a depth-first search (DFS) algorithm to count the number of strings of digits that are less than or equal to the input number and contain the digits 7, 5, and 3. The DFS function is recursive, and it adds the current string to the result if it contains all the digits 7, 5, and 3. If it doesn't, it continues the DFS for each digit 7, 5, and 3. The main function initializes the input number and calls the DFS function with the string "0".<｜end▁of▁sentence｜>
