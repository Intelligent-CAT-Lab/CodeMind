<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
3


```
n = int(input())

cnt = 0
for a in range(1, n):
    for b in range(1, n):
        x = a * b
        if x >= n:
            break
        cnt += 1

print(cnt)            

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
This code uses a nested for loop to iterate over the range of values for `a` and `b`, and calculates the product `x = a * b` for each combination. If the product is greater than or equal to `n`, the loop is broken and the counter is incremented. Finally, the counter is printed as the output.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input stream. The `System.out.println()` method is used to print the output to the console.</s>
