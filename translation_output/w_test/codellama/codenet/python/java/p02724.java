<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1024

Expected output:
2020


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
This code first prompts the user to enter a number, then it calculates the number of 500s that can be made from the total, and the remaining amount after subtracting the number of 500s. It then calculates the number of 5s that can be made from the remaining amount, and finally prints the total number of 500s and 5s that can be made.

Note that in Java, the `/` operator is used for integer division, which returns the integer part of the result, and the `%` operator is used for modulo division, which returns the remainder.</s>
