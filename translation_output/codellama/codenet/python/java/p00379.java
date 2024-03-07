<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, n, m = map(int, input().split())
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;
        for (int y = 1; y <= 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sum(String.valueOf(x))) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
}
```
Note that the `sum` method is a helper method that takes a string and returns the sum of its digits. It is used in the `if` statement to check if the sum of the digits of `x` is equal to `y`.</s>
