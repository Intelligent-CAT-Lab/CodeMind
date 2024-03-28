<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999991

Expected output:
666666662

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

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
This is a basic Java program that reads an integer `n` from the user, and then performs the following operations:

1. If `n` is divisible by 3, it prints `n / 3 * 2`.
2. If `n` is less than 3, it prints 1.
3. Otherwise, it prints `n / 3 * 2 + 1`.

The program uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output.

Note that the `gcd` and `sqrt` functions are not needed in this program, as they are not used. The `math` module is not needed either, as it is not used in this program.</s>
