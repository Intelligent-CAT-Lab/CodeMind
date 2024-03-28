<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    W, H = map(int, sys.stdin.readline().split())
    c = sys.stdin.readline().strip()
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

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the width, height, and character from the standard input, and then prints a rectangle of the specified size and character. The rectangle is centered in the output, with the character at the center. The rectangle is surrounded by plus signs on the edges, and vertical and horizontal lines inside the rectangle.
<|EOT|>
