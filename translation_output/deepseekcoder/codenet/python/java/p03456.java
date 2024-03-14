<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
#!/usr/bin/python3
# -*- coding: utf-8 -*-

import sys
from math import sqrt

def main():
    a, b = sys.stdin.readline().split()
    n = int(a + b)
    sqrtn = int(sqrt(n))
    i = 1
    for i in range(1, sqrtn + 1):
        if i * i == n:
            print('Yes')
            break
    else:
        print('No')


if __name__ == '__main__':
    main()

```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0] + input[1]);
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
```
<|EOT|>
