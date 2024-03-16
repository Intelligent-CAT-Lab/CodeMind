<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

r, d, x = map(int, sys.stdin.readline().split())

for i in range(10):
    x = r * x - d
    print(x)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `range` function is used to iterate over the numbers from 0 to 9. The rest of the code is similar to the Java code.</s>
