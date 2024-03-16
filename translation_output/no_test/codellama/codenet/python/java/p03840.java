<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int O = scanner.nextInt();

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }

        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);

        System.out.println(ans);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `Math.max()` method to find the maximum of two numbers.</s>
