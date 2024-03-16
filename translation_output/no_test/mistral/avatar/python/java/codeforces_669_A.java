<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int result = 0;
        if (n % 3 == 0) {
            result = n / 3 * 2;
        } else if (n < 3) {
            result = 1;
        } else {
            result = n / 3 * 2 + 1;
        }
        System.out.println(result);
    }
}
```</s>
