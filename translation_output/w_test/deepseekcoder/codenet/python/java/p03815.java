<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2


```
x=int(input())
n=x//11
x=x-11*n
if x==0:
    print(2*n)

elif 1<=x<=6:
    print(1+2*n)
else:
    print(2+2*n)


```

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = x / 11;
        x = x - 11 * n;
        if (x == 0) {
            System.out.println(2 * n);
        } else if (x >= 1 && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}
```

This Java code reads an integer from the standard input, calculates the number of multiples of 11 it can subtract without making the number negative, and then prints the result based on the remainder of the division by 11.
<|EOT|>
