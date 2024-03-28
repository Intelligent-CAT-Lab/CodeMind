<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3266

```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
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
        scanner.close();

        if (a <= b) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                System.out.print(b);
            }
        }
    }
}
```

This Java code reads two integers from the standard input, and then prints the smaller one repeated the number of times equal to the larger one.

Please note that in Java, we don't have the `input()` function like in Python, so we use `Scanner` to read the input. Also, Java doesn't have a direct equivalent to Python's `str()` function, so we use a for loop to print the numbers repeatedly.
<|EOT|>
