<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if (x.equals("7") || x.equals("5") || x.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
