<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# Python code

# Read input from user
input_values = input().split()

# Convert string inputs to integers
left = int(input_values[0]) + int(input_values[1])
right = int(input_values[2]) + int(input_values[3])

# Compare the values and print the result
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the sum of the first two and the last two, and then compares the two sums. The result is printed to the console.<｜end▁of▁sentence｜>
