<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
51

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
This code uses a similar approach as the Python code, but it is written in Java. It first prompts the user to enter a number `N`, and then it initializes a variable `target` to 1. It then enters a loop that continues until a condition is met.

Inside the loop, it first initializes a variable `count` to 0. It then iterates through the numbers from 1 to `target` (inclusive) and checks if each number is a divisor of `target`. If it is, it increments the `count` variable.

After the loop, it checks if the `count` variable is equal to `N`. If it is, it prints the value of `target` and breaks out of the loop. If it is not, it increments `target` and continues the loop.

The code then prints the final value of `target` and exits.

Note that this code is not optimized for performance, and it may take a long time to run for large values of `N`.</s>
