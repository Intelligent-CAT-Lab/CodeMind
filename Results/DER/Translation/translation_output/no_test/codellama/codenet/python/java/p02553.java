<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, c, d = map(int, input().split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = -1000000000000000000;
        ans = Math.max(ans, a * c, a * d, b * c, b * d);
        System.out.println(ans);
    }
}
```
Note that the `Math.max()` method is used to find the maximum of the four products. The `Scanner` class is used to read input from the user.</s>
