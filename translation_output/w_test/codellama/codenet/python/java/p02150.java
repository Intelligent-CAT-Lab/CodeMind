<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
7


```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```
This code first reads the input from the user using the `Scanner` class. It then calculates the difference between `a` and `b`, and the maximum value of `x - b` that is greater than or equal to zero. Finally, it calculates the sum of `x` and `n` multiplied by `b`, and prints the result modulo 1000000007.</s>
