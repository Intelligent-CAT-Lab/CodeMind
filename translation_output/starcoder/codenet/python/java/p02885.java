<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[A, B] = [int(i) for i in input().split()]

diff = A - B * 2
if diff < 0:
    print(0)
else:
    print(diff)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = arr[0] - arr[1] * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```
"""

import sys

if __name__ == "__main__":
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    A = data[0]
    B = data[1]
    diff = A - B * 2
    if diff < 0:
        print(0)
    else:
        print(diff)
<|endoftext|>
