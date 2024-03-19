<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes a counter to 1, and a variable x to the first integer. It then enters a loop where it doubles x and increments the counter until x is greater than the second integer. Finally, it prints the counter, which represents the number of times x was doubled to be less than or equal to the second integer.<｜end▁of▁sentence｜>
