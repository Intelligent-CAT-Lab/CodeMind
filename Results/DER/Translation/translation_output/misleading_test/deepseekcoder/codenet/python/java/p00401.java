<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54

Expected output:
33

```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(count / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then it multiplies `count` by 2 in a loop until `count` is greater than or equal to `N`. Finally, it prints `count / 2`.
<|EOT|>
