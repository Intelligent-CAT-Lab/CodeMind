<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
86

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

@@ Response
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

This Java code does the same thing as the Python code. It reads an integer from the user, then calculates the nth Fibonacci number. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.<｜end▁of▁sentence｜>
