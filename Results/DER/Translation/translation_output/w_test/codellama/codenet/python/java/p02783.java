<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println((int) Math.ceil(H / A));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.ceil()` method to round up the result of the division to the nearest integer. The `int` cast is used to convert the result of the division to an integer.</s>
