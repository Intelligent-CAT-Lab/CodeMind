<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
bB

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
# Python code

# Get input from user
x, a, b = map(int, input().split())

# Compare the absolute difference between x and a and x and b
if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")
```

In this Python code, we use the `input()` function to get the input from the user. The `split()` function is used to split the input into three separate values, which are then converted to integers using the `map()` function. The `abs()` function is used to get the absolute difference between `x` and `a` and `x` and `b`. If the absolute difference between `x` and `a` is less than the absolute difference between `x` and `b`, the program prints "A". Otherwise, it prints "B".<｜end▁of▁sentence｜>
