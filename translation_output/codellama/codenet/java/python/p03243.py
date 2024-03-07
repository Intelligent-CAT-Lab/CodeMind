<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n = int(input())

for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        sys.exit()
```
Note: The `sys.exit()` function is used to exit the program after the first match is found.</s>
