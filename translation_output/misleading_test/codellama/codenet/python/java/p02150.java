<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
4

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
        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.max()` method is used to find the maximum of two numbers.
* The `%` operator is used to perform modulo division.
* The `println()` method is used to print the result to the console.

Note: The `Math.max()` method returns the maximum of two numbers, but it returns a double value, so we need to cast it to an integer using the `(int)` operator.</s>
