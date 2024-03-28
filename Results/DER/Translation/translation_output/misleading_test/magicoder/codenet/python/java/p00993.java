<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java equivalent of the given Python code:

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

This Java code does the same thing as the Python code. It first calculates the product of all integers from 1 to 1500 and adds 2 to the result. Then it reads an integer from the standard input and prints all integers from 1 to that integer plus 1.<｜end▁of▁sentence｜>
