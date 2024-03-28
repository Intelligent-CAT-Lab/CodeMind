<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
4


```
a,b=map(int,input().split())
print(max(a+b,a-b,a*b))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(max);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Math.max()` method is used to find the maximum of two integers.
* The `System.out.println()` method is used to print the result to the console.

Note: The `Math.max()` method can take multiple arguments, so we can use it to find the maximum of three integers in one line.</s>
