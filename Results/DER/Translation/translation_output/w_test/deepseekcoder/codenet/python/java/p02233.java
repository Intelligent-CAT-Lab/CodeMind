<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
3


```
n=int(input())
a=1
b=1
i=0
while i<n:
    a,b=b,a+b
    i+=1
print(a)

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then calculates the nth Fibonacci number. The Fibonacci sequence starts with 1 and 1, and each subsequent number is the sum of the previous two. The result is then printed to the console.
<|EOT|>
