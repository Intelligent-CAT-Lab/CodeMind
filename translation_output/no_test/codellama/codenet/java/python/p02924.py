<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(sys.stdin.readline().strip())
result = 0
for i in range(n - 1, 0, -1):
    result += i

print(result)
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `range` function is used to iterate over the numbers from `n - 1` to `0` in reverse order. The `strip` method is used to remove any trailing whitespace from the input string. The `print` function is used to output the result.</s>
