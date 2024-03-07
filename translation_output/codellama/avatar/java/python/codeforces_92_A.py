<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class codeforces_92_A {
    public static void codeforces_92_A(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int i = 1, req = 1;

        while (k - req >= 0) {
            if (k - req >= 0) {
                k = k - req;
            } else {
                break;
            }
            i++;
            if (i % n != 0) {
                req = i % n;
            } else {
                req = n;
            }
        }

        System.out.println(k);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n, k = map(int, input().split())
i = 1
req = 1

while k - req >= 0:
    if k - req >= 0:
        k = k - req
    else:
        break
    i += 1
    if i % n != 0:
        req = i % n
    else:
        req = n

print(k)
```
This is the Python code equivalent to the Java code you provided. It uses the `input()` function to read the input from the user, and the `map()` function to convert the input to integers. The rest of the code is similar to the Java code, with the exception of the `print()` function, which is used to print the output in Python.</s>
