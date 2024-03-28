<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-75

```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int sum = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```
This code uses a nested for loop to iterate over all possible values of `z` and `y`, and checks if the condition `0 <= s - y - z <= k` is true for each pair. If it is, the sum is incremented. The final sum is then printed to the console.

Note that this code assumes that the input is a valid integer, and will throw a `NumberFormatException` if the input is not a valid integer. It also assumes that the input is separated by a space, and will throw a `NoSuchElementException` if the input is not separated by a space.</s>
