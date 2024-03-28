<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
n,m = map(int,input().split())

points = ["0"] * n

for i in range(n//2 + 1, n):
    points[i] = str(m)

print(" ".join(points))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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

        System.out.println(String.join(" ", points));
    }
}
```
Note that the `String.join()` method is used to join the elements of the `points` array into a single string, separated by spaces. The `String.valueOf()` method is used to convert the `m` variable to a string.</s>
