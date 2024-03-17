<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19

Expected output:
5


```
#!/usr/bin/env python3
t = int(input())

count = 0
speed = 1
margin = 0
while t > 0:
    t -= speed
    count += 1
    if margin + speed * 3 <= t:
        speed *= 3
        margin += speed
    elif t < margin:
        margin -= speed
        speed /= 3
print(count)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;
        int speed = 1;
        int margin = 0;
        while (t > 0) {
            t -= speed;
            count++;
            if (margin + speed * 3 <= t) {
                speed *= 3;
                margin += speed;
            } else if (t < margin) {
                margin -= speed;
                speed /= 3;
            }
        }
        System.out.println(count);
    }
}
```
This code is similar to the Python code, but it uses Java's `Scanner` class to read input from the user, and it uses Java's `System.out.println()` method to print the output. The logic for calculating the number of steps is the same as in the Python code.</s>
