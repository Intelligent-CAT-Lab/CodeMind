<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    left = sum(int(x) for x in input().split())
    right = sum(int(x) for x in input().split())
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two pairs of integers from the standard input, calculates the sum of the first two integers in each pair, and then compares the sums. It prints "Left" if the sum of the first pair is greater, "Right" if the sum of the second pair is greater, and "Balanced" if the sums are equal.
<|EOT|>
