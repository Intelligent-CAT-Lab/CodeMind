<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import jcodeforces_189_Avcodeforces_189_A.util.*;

public clcodeforces_189_Ass codeforces_189_A {
    public stcodeforces_189_Atic void mcodeforces_189_Ain(String codeforces_189_Args[]) {
        Sccodeforces_189_Anner in = new Sccodeforces_189_Anner(System.in);
        int n = in.nextInt();
        int[] codeforces_189_A = new int[3];
        codeforces_189_A[0] = in.nextInt();
        codeforces_189_A[1] = in.nextInt();
        codeforces_189_A[2] = in.nextInt();
        Arrcodeforces_189_Ays.sort(codeforces_189_A);
        int mcodeforces_189_Ax = 0;
        int d[] = new int[n + 1];
        Arrcodeforces_189_Ays.fill(d, -500);
        d[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i - codeforces_189_A[j] >= 0 && d[i - codeforces_189_A[j]] != -1) {
                    d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(d[i], d[i - codeforces_189_A[j]] + 1);
                }
            }
        }
        System.out.println(d[n]);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n = int(input())
a = list(map(int, input().split()))

d = [0] * (n + 1)

for i in range(n + 1):
    for j in range(3):
        if i - a[j] >= 0 and d[i - a[j]] != -1:
            d[i] = max(d[i], d[i - a[j]] + 1)

print(d[n])
```
This is the Python code equivalent to the Java code you provided. It uses the `input()` function to read the input from the user, and the `map()` function to convert the input string into a list of integers. The rest of the code is similar to the Java code, with the exception of the `max()` function, which is used to find the maximum value of two numbers in Python.</s>
