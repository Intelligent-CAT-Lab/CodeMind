<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then checks if the second integer is a multiple of the first. If it is, it prints the sum of the two integers. If it's not, it prints the difference between the two integers.<｜end▁of▁sentence｜>
