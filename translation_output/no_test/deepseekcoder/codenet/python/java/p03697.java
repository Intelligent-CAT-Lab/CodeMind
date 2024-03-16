<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```

### Response:
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum = a + b;
        if (sum >= 10) {
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, adds them together, and then prints the result if it is greater than or equal to 10. If the result is less than 10, it prints "error".
<|EOT|>
