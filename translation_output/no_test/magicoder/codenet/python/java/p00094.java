<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a <= 100 && b <= 100) {
            double result = (a * b) / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if they are less than or equal to 100, and if so, it calculates the product of the two numbers divided by 3.305785 and prints the result with four decimal places.<｜end▁of▁sentence｜>
