<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#!/usr/bin/env python

import sys
import math
import itertools as it
from collections import deque

sys.setrecursionlimit(10000000)

MOD = 10 ** 9 + 7

n, k = map(int, raw_input().split())

print k ** n % MOD


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger result = BigInteger.valueOf(k).pow(n);
        System.out.println(result.mod(BigInteger.valueOf(1000000007)));
    }
}
```
This code uses the `BigInteger` class to perform the modular exponentiation, which is necessary because the result of the exponentiation can be very large. The `mod` method is used to compute the result modulo 1000000007.

Note that the `BigInteger` class is part of the Java standard library, so you don't need to import any additional libraries to use it.</s>
