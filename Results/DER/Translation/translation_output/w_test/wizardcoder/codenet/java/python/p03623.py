Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

x = int(input())
a = int(input())
b = int(input())

if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")
```

Explanation:

- We first import the `math` module to use the `abs()` function.
- We then take input from the user using the `input()` function and convert it to integer using the `int()` function.
- We use the `if` statement to check if the absolute difference between `x` and `a` is less than the absolute difference between `x` and `b`.
- If the condition is true, we print "A" else we print "B".<|endoftext|>
