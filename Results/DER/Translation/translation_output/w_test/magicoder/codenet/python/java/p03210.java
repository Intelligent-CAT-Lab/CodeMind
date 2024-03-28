<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
YES


```
# -*- coding: utf-8 -*-
"""
Created on Wed Jan  2 15:24:02 2019

@author: Yamazaki Kenichi
"""

X = input()

if X=='7' or X=='5' or X=='3':
    ans = 'YES'
else:
    ans = 'NO'

print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        String ans;

        if (X == 7 || X == 5 || X == 3) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's 7, 5, or 3, and prints "YES" if it is, and "NO" otherwise.<｜end▁of▁sentence｜>
