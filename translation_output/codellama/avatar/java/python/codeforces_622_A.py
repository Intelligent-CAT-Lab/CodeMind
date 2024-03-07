<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans != 0) ? ans : n);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import math

n1 = int(input())
n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
ans = n1 - (((n + 1) * n) / 2)
print(ans if ans != 0 else n)
```
This is the equivalent Python code for the given Java code. The `math` module is used to perform mathematical operations, and the `input()` function is used to read input from the user. The rest of the code is similar to the Java code, with some minor changes to account for the differences in syntax between the two languages.</s>
