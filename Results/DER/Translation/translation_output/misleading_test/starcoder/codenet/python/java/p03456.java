<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a + b;
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                break;
            }
        } else {
            System.out.println("No");
        }
    }
}
```

'''
<|endoftext|>
