<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1024

Expected output:
2036

```
total = int(input())
num_500 = total // 500

remain = total - num_500 * 500
num_5 = remain // 5

print(num_500 * 1000 + num_5 * 5)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int num_500 = total / 500;
        int remain = total - num_500 * 500;
        int num_5 = remain / 5;
        System.out.println(num_500 * 1000 + num_5 * 5);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it calculates the number of 500s and the number of 5s that can be obtained from the total amount. Finally, it prints the total amount of money that can be obtained.

Note that in Java, the `/` operator is used for integer division, which means that the result is truncated to an integer. This is different from Python, where the `/` operator performs floating-point division.</s>
