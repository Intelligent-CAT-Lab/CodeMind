<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12

Expected output:
-51

```
x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `x` and `y`. It then checks if `y` is divisible by `x` using the modulo operator `%`, and if it is, it prints the sum of `x` and `y`, otherwise it prints the difference between `y` and `x`.</s>
