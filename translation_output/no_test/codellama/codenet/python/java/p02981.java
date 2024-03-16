<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `if` statement is used to check if the product of `n` and `a` is greater than `b`, and if it is, the `ans` variable is set to the product. Finally, the `System.out.println()` method is used to print the result.</s>
