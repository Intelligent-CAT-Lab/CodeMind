<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay!


```
a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if they are less than 9, and prints "Yay!" if they are, otherwise it prints ":(".<｜end▁of▁sentence｜>
