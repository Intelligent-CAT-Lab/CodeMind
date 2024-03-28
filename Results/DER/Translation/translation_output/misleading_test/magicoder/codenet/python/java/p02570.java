<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
{N-

```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data[] = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }
        if ((double) data[0] / data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input (System.in), stores them in an array, and then checks if the first number divided by the second number is less than or equal to the third number. If it is, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
