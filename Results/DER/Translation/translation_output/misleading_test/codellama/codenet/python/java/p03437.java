<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
-50

```
x,y=map(int,input().split())
print(x if x%y else -1)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x % y == 0) {
            System.out.println(-1);
        } else {
            System.out.println(x);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `%` operator to check if `x` is divisible by `y`. If it is, it prints `-1`, otherwise it prints `x`.</s>
