<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
90

Expected output:
4


```
x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it uses a `for` loop to iterate from 1 to 100000. For each iteration, it checks if `360 * i % x == 0`, where `x` is the input from the user. If this condition is true, it prints `360 * i / x` and breaks out of the loop.

Note that the `break` statement is used to exit the loop once the condition is met, to avoid unnecessary iterations.</s>
