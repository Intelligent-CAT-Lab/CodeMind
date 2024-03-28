Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 100

Expected output:
0 100

```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
n,m = map(int,input().split())

points = ["0"] * n

for i in range(n//2 + 1, n):
    points[i] = str(m)

print(" ".join(points))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] points = new String[n];
        for (int i = n/2 + 1; i < n; i++) {
            points[i] = Integer.toString(m);
        }
        for (int i = 0; i < n/2 + 1; i++) {
            points[i] = Integer.toString(0);
        }
        System.out.println(String.join(" ", points));
    }
}
```<|endoftext|>
