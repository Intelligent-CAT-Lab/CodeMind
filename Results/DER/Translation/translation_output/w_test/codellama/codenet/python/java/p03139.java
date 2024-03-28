<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int minAB = Math.min(A, B);
        int maxAB = Math.max(A + B - N, 0);
        System.out.println(minAB + " " + maxAB);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.min()` and `Math.max()` methods are used to find the minimum and maximum of two integers, respectively.
* The `System.out.println()` method is used to print the result to the console.

Note: The `Math.min()` and `Math.max()` methods are used instead of the `min()` and `max()` methods from the Python code, because Java does not have a built-in `min()` and `max()` method for integers.</s>
