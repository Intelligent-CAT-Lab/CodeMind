<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

        String result = String.join(" ", points);
        System.out.println(result);
    }
}
```
<|EOT|>
