<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 2 4

Expected output:
-85

```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it uses a `for` loop to iterate over the range of values from `a` to `b`, and checks if `h` is divisible by `a + c` using the modulo operator. If it is, it increments the `count` variable. Finally, it prints the value of `count`.

Note that the `map` function in Python is not necessary in Java, as the `Scanner` class can directly read input as integers.</s>
