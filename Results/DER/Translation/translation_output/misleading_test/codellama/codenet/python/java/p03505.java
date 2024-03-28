<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
-6

```
K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (int)((K-A) / (A-B))*2);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `int` function to convert the input to integers. It then uses the `if-else` statement to check the conditions and print the appropriate output.

Note that the `//` operator is used to perform integer division, which returns the integer part of the result. The `*2` at the end of the `else` block is used to double the result, which is necessary to get the correct output.</s>
