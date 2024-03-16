<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
import os
import random
import re
import sys
from math import gcd
from math import sqrt
n = int ( input ( ) )
if n % 3 == 0 :
    print ( n // 3 * 2 )
elif n < 3 :
    print ( 1 )
else :
    print ( n // 3 * 2 + 1 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 3 == 0) {
            System.out.println(n / 3 * 2);
        } else if (n < 3) {
            System.out.println(1);
        } else {
            System.out.println(n / 3 * 2 + 1);
        }
    }
}
```
<|EOT|>
