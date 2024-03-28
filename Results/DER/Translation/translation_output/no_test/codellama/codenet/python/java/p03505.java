<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (int) Math.floor((K-A) / (A-B)) * 2);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.floor()` method is used to round down the result of the division to the nearest integer.</s>
