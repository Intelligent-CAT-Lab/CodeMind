<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 100

Expected output:
0 0 100


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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] points = new String[n];
        for (int i = 0; i < n; i++) {
            points[i] = "0";
        }

        for (int i = n / 2; i < n; i++) {
            points[i] = Integer.toString(m);
        }

        System.out.println(String.join(" ", points));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes an array of strings with the first integer size and fills it with zeros, then replaces the last half of the array with the second integer. Finally, it prints the array elements separated by spaces.
<|EOT|>
