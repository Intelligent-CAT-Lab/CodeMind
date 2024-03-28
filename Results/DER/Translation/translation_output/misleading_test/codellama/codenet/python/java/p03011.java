<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
-64

```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;
        System.out.println(sum);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.max()` method to find the maximum of three numbers. The sum of the three numbers is then calculated and printed to the console.</s>
