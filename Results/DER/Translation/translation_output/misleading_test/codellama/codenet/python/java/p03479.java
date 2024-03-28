<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
32

```
 #a = 314159265
#b = 358979323846264338
a, b = map(int, input().split())
count = 1
x = a
#print(x)
while x * 2 <= b:
    x = x * 2
    #print(x)
    count += 1
print(count)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count++;
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers `a` and `b`. It then uses a `while` loop to repeatedly multiply `x` by 2 as long as it is less than or equal to `b`. The `count` variable is incremented each time the loop executes. Finally, the `println()` method is used to print the value of `count` to the console.</s>
