<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3900

```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Math.pow()` method is used to calculate the power of 2 to the given exponent.
* The `int` cast is used to convert the result of the `Math.pow()` method to an integer.
* The `System.out.println()` method is used to print the result to the console.</s>
