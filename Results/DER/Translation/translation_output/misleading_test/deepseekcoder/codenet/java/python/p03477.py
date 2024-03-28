<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
eft

```
import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
        int right = sc.nextInt() + sc.nextInt();
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}

```

### Response:
```python
def p03477():
    left, right = map(int, input().split())
    left += sum(map(int, input().split()))
    right += sum(map(int, input().split()))
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

p03477()
```

This Python function reads three lines of input, each containing two integers. The first two integers are added together to form the left variable, and the next two integers are added together to form the right variable. Then it compares the left and right variables and prints "Left" if left is greater, "Right" if right is greater, and "Balanced" if they are equal.
<|EOT|>
