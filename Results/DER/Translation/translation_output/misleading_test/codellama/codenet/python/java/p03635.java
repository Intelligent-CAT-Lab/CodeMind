<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
-1

```
n, m = map(int, input().split())
print((n-1)*(m-1))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `n` and `m`. It then calculates the product of `n-1` and `m-1` and prints the result to the console.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the next integer from the input stream. The `System.out.println()` method is used to print the result to the console.</s>
