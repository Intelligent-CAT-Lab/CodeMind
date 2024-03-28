<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

@@ Response
```python
x, a, b = map(int, input().split())
if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the absolute difference between the input number and each of the two other numbers, and then prints "A" if the absolute difference between the input number and the first number is less than the absolute difference between the input number and the second number, and "B" otherwise.<｜end▁of▁sentence｜>
