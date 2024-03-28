Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        String ans;
        if (X == 7 || X == 5 || X == 3) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
