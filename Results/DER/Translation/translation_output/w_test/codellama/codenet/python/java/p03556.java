<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
9


```
import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))
```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a * a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to calculate the square root of the input. The result is then printed to the console.

Note that the `Math.sqrt()` method returns a `double` value, so we need to cast it to an `int` to get the correct result.</s>
