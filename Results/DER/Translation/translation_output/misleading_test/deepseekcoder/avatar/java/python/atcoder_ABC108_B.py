<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7 -80

```
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

### Response:
```python
def solve():
    x1, y1, x2, y2 = map(int, input().split())
    x3 = x2 + (y1 - y2)
    y3 = y2 - (x1 - x2)
    x4 = x1 - (y2 - y1)
    y4 = y1 + (x2 - x1)
    print(x3, y3, x4, y4)

solve()
```

This Python code reads four integers from the input, calculates the coordinates of the fourth point, and prints them. The calculation is based on the conditions given in the Java code.
<|EOT|>
