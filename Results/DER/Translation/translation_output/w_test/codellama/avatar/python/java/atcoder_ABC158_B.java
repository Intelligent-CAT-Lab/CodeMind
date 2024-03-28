<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614890


```
N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```
This code first reads the input from the user, then it splits the input into three integers `N`, `A`, and `B` using the `split()` method. It then calculates the value of `ans` using the formula `ans = N // (A + B) * A`, and the value of `rem` using the formula `rem = N % (A + B)`. Finally, it calculates the final answer by adding `ans` and `rem`, and printing the result.

Note that in Java, the `//` operator is used for integer division, and the `%` operator is used for modulo division.</s>
