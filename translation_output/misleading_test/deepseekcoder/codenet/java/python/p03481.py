<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
31

```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```

### Response:
```python
import sys

def p03481():
    X, Y = map(int, sys.stdin.readline().split())

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

p03481()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `map()` function is used to convert the input into integers. The rest of the code is translated directly from the Java code.
<|EOT|>
