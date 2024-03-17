<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
103

Expected output:
3


```
import math
x = int(input())

y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)

print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int) Math.floor(y * 1.01);
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then calculates the number of years it takes for the investment to reach or exceed the input value. The investment starts with a value of 100 and increases by 1% each year. The `Math.floor` function is used to round down the result of the multiplication to the nearest integer.<｜end▁of▁sentence｜>
