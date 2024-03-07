<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))


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
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            return;
        }

        System.out.println("0 " + Math.max(b - k, 0));
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.max()` method is used to find the maximum of two numbers.</s>
