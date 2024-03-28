<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
1


```
N = int(input())
target = 1
while True:
    count = 0
    for i in range(1, target+1):
        if target % i == 0:
            count += 1
    if count == N:
        print(target)
        break
    target += 1


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first prompts the user to enter a number `N`, and then it initializes a variable `target` to 1.

The code then enters a `while` loop that continues until a condition is met. The condition is that the number of divisors of `target` is equal to `N`. If this condition is met, the code prints the value of `target` and breaks out of the loop.

The code uses a `for` loop to count the number of divisors of `target`. It starts at 1 and iterates up to `target`, and for each divisor `i`, it checks if `target` is divisible by `i`. If it is, it increments a counter `count`.

After the `for` loop, the code checks if `count` is equal to `N`. If it is, the code prints the value of `target` and breaks out of the loop. If it is not, the code increments `target` and starts the loop again.

The code continues to loop until the condition is met, at which point it prints the value of `target` and exits.</s>
