<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] points = new String[n];
        for (int i = 0; i < n; i++) {
            if (i < n / 2 + 1) {
                points[i] = "0";
            } else {
                points[i] = String.valueOf(m);
            }
        }
        System.out.println(String.join(" ", points));
    }
}
```
This is the Java code that produces the same output as the Python code. The `Scanner` class is used to read the input from the user, and the `String.join()` method is used to join the elements of the `points` array into a single string separated by spaces.</s>
