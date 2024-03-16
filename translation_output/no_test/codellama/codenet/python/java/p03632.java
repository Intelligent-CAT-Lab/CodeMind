<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int ans = Math.min(B, D) - Math.max(A, C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.min` and `Math.max` methods are used to find the minimum and maximum values of the input numbers.</s>
