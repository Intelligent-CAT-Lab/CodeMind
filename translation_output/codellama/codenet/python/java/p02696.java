<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println((int) Math.floor(A * Math.min(B - 1, N) / B));
    }
}
```
This is the equivalent Java code for the given Python code. The `Scanner` class is used to read input from the user, and the `Math.floor()` method is used to round down the result of the division to the nearest integer. The `Math.min()` method is used to find the minimum of two values, which is used to ensure that the result of the division is not greater than `N`.</s>
