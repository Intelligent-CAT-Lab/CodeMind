<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
squareo1001

```
print('square1001' if input()=='ani' else 'e869120')


```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("ani")) {
            System.out.println("square1001");
        } else {
            System.out.println("e869120");
        }
    }
}
```

In this Java code, we use a `Scanner` to read the input from the user. If the input is "ani", we print "square1001". Otherwise, we print "e869120".
<|EOT|>
