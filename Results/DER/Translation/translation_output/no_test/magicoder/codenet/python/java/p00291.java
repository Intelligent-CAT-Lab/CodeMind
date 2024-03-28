<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int c1 = Integer.parseInt(input[0]);
        int c5 = Integer.parseInt(input[1]);
        int c10 = Integer.parseInt(input[2]);
        int c50 = Integer.parseInt(input[3]);
        int c100 = Integer.parseInt(input[4]);
        int c500 = Integer.parseInt(input[5]);

        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;

        System.out.println(sum >= 1000 ? 1 : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads input from the user, splits it into separate strings, converts each string to an integer, and then calculates the sum of the coins. If the sum is greater than or equal to 1000, it prints 1; otherwise, it prints 0.<｜end▁of▁sentence｜>
