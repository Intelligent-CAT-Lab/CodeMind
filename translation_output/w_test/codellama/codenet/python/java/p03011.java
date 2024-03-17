<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


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
        System.out.println(a + b + c - max);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Math.max()` method is used to find the maximum of three numbers.
* The `System.out.println()` method is used to print the result to the console.

Note: The `map()` function in Python is not available in Java, so we need to use a different approach to read the input and find the maximum.</s>
