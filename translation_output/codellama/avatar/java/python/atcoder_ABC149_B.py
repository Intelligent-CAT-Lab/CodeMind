<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

A, B, K = map(int, sys.stdin.readline().split())

if A + B <= K:
    print(0, 0)
elif A - K < 0:
    print(0, A + B - K)
else:
    print(A - K, B)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `split` method is used to split the input string into three parts. The rest of the code is similar to the Java code, with the exception of the `print` function, which is used to print the output in Python.</s>
