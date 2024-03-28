<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            double x = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x + 1);
        }
    }
}
```
Note that in Java, we need to use the `Math` class to perform mathematical operations, and we need to use the `Scanner` class to read input from the user. Additionally, we need to use the `int` keyword to convert the result of the mathematical operations to an integer.</s>
