<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 6

Expected output:
-5

```
n, a, b = map(int,input().split())

if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `if` statement to check the conditions and print the appropriate output.

The first `if` statement checks if `n` is greater than or equal to 2, and if so, it checks if `b` is greater than or equal to `a`. If both conditions are true, it prints the result of the calculation `(n - 2) * (b - a) + 1`. If `b` is not greater than or equal to `a`, it prints 0.

The second `if` statement checks if `n` is less than or equal to 1, and if so, it checks if `a` is equal to `b`. If both conditions are true, it prints 1. If `a` is not equal to `b`, it prints 0.

The code is enclosed in the `main` method, which is the entry point of the program. The `Scanner` class is used to read input from the user, and the `if` statements are used to check the conditions and print the appropriate output.</s>
