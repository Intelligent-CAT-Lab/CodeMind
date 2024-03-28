<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
Left


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
def main():
    left, right = map(int, input().split())
    left += sum(map(int, input().split()))
    right += sum(map(int, input().split()))
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input().split()` function to read the input from the user. This function splits the input into a list of strings, and the `map(int, ...)` function converts these strings into integers. The `sum(...)` function then adds up all the integers.

The rest of the code is a direct translation of the Java code. If the left sum is greater than the right sum, it prints "Left". If they are equal, it prints "Balanced". Otherwise, it prints "Right".
<|EOT|>
