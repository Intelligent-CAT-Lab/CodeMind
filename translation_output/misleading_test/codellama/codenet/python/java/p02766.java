<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
0

```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;

        while (n / (int) Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of `k`. The `while` loop continues until the result of the division is 0, at which point the loop breaks and the value of `i` is printed.</s>
