<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from user
left = sum(map(int, input().split()))
right = sum(map(int, input().split()))

# comparing the values
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
```

This Python code does the same thing as the Java code. It reads two integers from the user for each side (left and right), sums them, and then compares the sums. It prints "Left" if the left sum is greater than the right sum, "Balanced" if they are equal, and "Right" if the right sum is greater.<｜end▁of▁sentence｜>
