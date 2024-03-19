<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 0 0 0 0

Expected output:
-20

```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int I = Integer.parseInt(tokens[0]);
        int J = Integer.parseInt(tokens[1]);
        int L = Integer.parseInt(tokens[2]);
        int O = Integer.parseInt(tokens[3]);

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
This code uses the `Scanner` class to read input from the user, and the `String.split()` method to split the input string into an array of strings. The `Integer.parseInt()` method is used to convert the strings to integers.

The code then calculates the value of `a` and `b` using the given formulae, and uses the `Math.max()` method to find the maximum of `a` and `b`.

Finally, the code prints the result to the console using `System.out.println()`.</s>
