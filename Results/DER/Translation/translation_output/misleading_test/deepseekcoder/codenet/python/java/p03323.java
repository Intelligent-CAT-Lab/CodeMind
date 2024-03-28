<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4

Expected output:
.bih

```
a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then checks if both are less than 9. If they are, it prints "Yay!". Otherwise, it prints ":(".
<|EOT|>
