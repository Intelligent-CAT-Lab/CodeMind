<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(points[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the standard input, creates an array of strings `points` of size `n`, initializes all elements of `points` to "0", then sets the elements from `n/2 + 1` to `n` to `m`. Finally, it prints all elements of `points` separated by spaces.<｜end▁of▁sentence｜>
