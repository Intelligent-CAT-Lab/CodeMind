<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        double x = ((double)(A*A - B*B)) / (2*(A - B));
        if (x % 1 == 0) {
            System.out.println((int)x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the value of `x`, and then checks if `x` is an integer. If it is, it prints `x` as an integer. If not, it prints "IMPOSSIBLE".<｜end▁of▁sentence｜>
