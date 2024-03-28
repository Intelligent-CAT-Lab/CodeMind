<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
5

```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(floor(A*min(B-1, N)/B));
    }

    public static int floor(double x) {
        return (int) Math.floor(x);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
```
Note: The `floor` method is used to round down the result of the division to the nearest integer. The `min` method is used to find the minimum of two numbers.</s>
