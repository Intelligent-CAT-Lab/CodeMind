<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 4

Expected output:
92

```
n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rot = n/k;
        int x = n;
        if (k == 1 || n == k || n%k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k*rot;
        }
        int t = x%k;
        System.out.println(Math.min(t, Math.abs(t-k)));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `min` method is used to find the minimum of two values, and the `abs` method is used to find the absolute value of a number.

The code first reads in two integers `n` and `k` from the user, and then calculates the number of rotations `rot` that can be performed on the number `n` using the division operator `/`. It then calculates the remainder `x` of `n` after dividing by `k`, and checks if `x` is equal to 0. If it is, then the number `n` is divisible by `k`, and the code prints 0.

Otherwise, the code calculates the minimum of `t` and `abs(t-k)`, where `t` is the remainder of `x` after dividing by `k`. This is the minimum number of digits that need to be changed to make `n` divisible by `k`. The code then prints this minimum value.

For example, if the input is `7 4`, then `n` is 7, `k` is 4, and `rot` is 1. `x` is 3, and `t` is 3. The minimum of `t` and `abs(t-k)` is 3, so the code prints 3.</s>
