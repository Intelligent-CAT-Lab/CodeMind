<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3


```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```
[/INST]

Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                int result = (i - ~(j ^ (n % 2 < (j + 2 < n > i * 2)))) % n + 1;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` and `System.out.println()` methods to print output to the console. The `^` operator is used for bitwise XOR, and the `~` operator is used for bitwise NOT. The `+` operator is used for addition, and the `%` operator is used for modulo division.</s>
