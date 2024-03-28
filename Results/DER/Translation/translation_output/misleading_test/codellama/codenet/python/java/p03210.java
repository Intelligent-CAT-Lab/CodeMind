<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
YiES

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `equals()` method to compare the input with the desired values. If the input is equal to "7", "5", or "3", the program prints "YES", otherwise it prints "NO".</s>
