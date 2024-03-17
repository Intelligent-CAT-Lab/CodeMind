<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
50


```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B, D) - Math.max(A, C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `Math.min()` and `Math.max()` methods are used to find the minimum and maximum values of the input numbers.
* The `if-else` statement is used to check if the difference between the minimum and maximum values is positive, and print the result accordingly.

Note: The `import java.util.Scanner;` statement is not required if you are using an IDE that automatically imports the necessary classes.</s>
