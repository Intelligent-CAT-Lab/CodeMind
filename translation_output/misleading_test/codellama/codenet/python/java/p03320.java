<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
45
-9
76
-23
-21
-67
-52
24
21
-13

```
K = int(input())
a = 0
d = 1
def snuke(x):
    a = 0
    while x>0:
        a += x%10
        x //= 10
    return a
for i in range(1, K+1):
    x = a + d
    y = a + 10*d
    if x/snuke(x) <= y/snuke(y):
        a = x
    else:
        a = y
        d *= 10
    print(a)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;

        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if (x / snuke(x) <= y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```
This code first prompts the user to enter a value for `K`, and then it initializes two variables `a` and `d` to 0 and 1, respectively.

The code then enters a loop that runs `K` times. In each iteration, it calculates two values `x` and `y` based on the current values of `a` and `d`. It then checks which of the two values is smaller, and updates `a` and `d` accordingly.

The `snuke` function is used to calculate the sum of the digits of a given integer.

Finally, the code prints the value of `a` after each iteration.

Note that the code assumes that the input `K` is a positive integer. If the input is not a positive integer, the code will throw an exception.</s>
