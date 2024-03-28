<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
-60

```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```

@@ Response
```python
o, n, g = map(int, input().split())
x = 0
borrow = 0

for i in range(1, g + 1):
    x += i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the total cost of the gifts, and then calculates the difference between the total cost and the amount of money the child has. If the difference is less than or equal to zero, it prints 0; otherwise, it prints the difference.<｜end▁of▁sentence｜>
