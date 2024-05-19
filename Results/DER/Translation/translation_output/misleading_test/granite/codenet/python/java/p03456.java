System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 21

Expected output:
Yes

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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = a + b;
        int sqrtn = (int) Math.sqrt(n);
        boolean isPerfectSquare = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Test input:
1 21

Expected output:
Yes<|endoftext|>
