<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(Math.floor(A * Math.min(B - 1, N) / B));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.floor` method to round the result of the division to the nearest integer. The `Math.min` method is used to find the minimum of `B - 1` and `N`, which is used to calculate the number of times the loop will run. The `Math.floor` method is then used to round the result of the division to the nearest integer.</s>
