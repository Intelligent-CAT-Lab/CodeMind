<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

```
import java.util.*;

class p03416 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```

### Response:
```python
def p03416(a, b):
    count = 0
    for i in range(a, b+1):
        array = [int(d) for d in str(i)]
        if len(array) < 5:
            array = [0]*(5-len(array)) + array
        if array[0] == array[4] and array[1] == array[3]:
            count += 1
    return count

# Test input
a = 11009
b = 11332

# Expected output
print(p03416(a, b))
```

This Python code does the same thing as the Java code. It counts the number of 5-digit numbers in the range from `a` to `b` (inclusive) that have the same first and last digit. The `array` list is created by converting the integer `i` to a string, then converting each character of the string back to an integer. The `if len(array) < 5:` line is needed because the range of `i` may not always be 5 digits long. The `array = [0]*(5-len(array)) + array` line pads the front of the list with zeros if `i` is less than 5 digits long.
<|EOT|>
