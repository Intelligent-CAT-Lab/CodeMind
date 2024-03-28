<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
-+
|B|5
u-Y

```

import java.util.Scanner;

public class p00363 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();
        String c = scanner.next();
        int x = (W - 1) / 2;
        int y = (H - 1) / 2;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j == 0 && i == 0 || j == 0 && i == H - 1 || j == W - 1 && i == 0 || j == W - 1 && i == H - 1) {
                    System.out.print("+");
                } else if (j != 0 && j != W - 1 && i == 0 || j != 0 && j != W - 1 && i == H - 1) {
                    System.out.print("-");
                } else if (i != 0 && i != H - 1 && j == 0 || i != 0 && i != H - 1 && j == W - 1) {
                    System.out.print("|");
                } else if (j == x && i == y) {
                    System.out.print(c);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}


```

### Response:
```python
import sys

def draw_rectangle(W, H, c):
    x = (W - 1) // 2
    y = (H - 1) // 2

    for i in range(H):
        for j in range(W):
            if j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1:
                print("+", end="")
            elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
                print("-", end="")
            elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
                print("|", end="")
            elif j == x and i == y:
                print(c, end="")
            else:
                print(".", end="")
        print()

W, H = map(int, sys.stdin.readline().split())
c = sys.stdin.readline().strip()
draw_rectangle(W, H, c)
```

In this Python code, we define a function `draw_rectangle` that takes three arguments: the width `W`, the height `H`, and the character `c`. The function uses nested loops to iterate over each cell in the rectangle. If the cell is at the edge of the rectangle, it prints a "+", a "-" if it's on the top or bottom edge, a "|" if it's on the left or right edge, or `c` if it's the center cell. Otherwise, it prints a ".". The function is then called with the inputs read from the standard input.
<|EOT|>
