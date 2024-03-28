<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // åºå
        System.out.println(result);
        sc.close();
    }

}
```

@@ Response
```python
# Python code

n = int(input())

# ä¸»å¦ç
result = 0
for i in range(n - 1, 0, -1):
    result += i

# åºå
print(result)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then calculates the sum of all integers from `n - 1` down to `1`, and finally prints the result.<｜end▁of▁sentence｜>
