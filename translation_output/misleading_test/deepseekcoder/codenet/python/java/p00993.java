<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
3

```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long product = 1;
        for (int i = 1; i <= 1500; i++) {
            product *= i;
        }
        System.out.println(product + 2);

        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It calculates the product of all integers from 1 to 1500 and adds 2 to the result. Then it prints the result for each integer from 1 to the input number.

Please note that the Python code uses the `reduce` function to calculate the product of all integers from 1 to 1500. In Java, we don't have a built-in `reduce` function, so we use a `for` loop to calculate the product.
<|EOT|>
