<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
16


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
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `x` and `y`. It then checks if `x` is divisible by `y`, and if it is, it prints `x`, otherwise it prints `-1`.</s>
