<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
6


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
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
This code uses a nested for loop to iterate over all possible values of `z` and `y`, and checks if the condition `0 <= s - y - z <= k` is true for each pair. If it is, it increments the `count` variable. Finally, it prints the value of `count`.

Note that the `map` function in Python is not necessary in Java, as the `Scanner` class can be used to read input and convert it to integers directly.</s>
