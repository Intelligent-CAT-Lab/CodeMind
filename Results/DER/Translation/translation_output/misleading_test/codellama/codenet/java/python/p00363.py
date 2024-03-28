<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

W, H, c = map(int, sys.stdin.readline().split())
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
```
This code reads the input from the standard input and prints the output to the standard output. It uses the `map` function to convert the input string to a list of integers, and then uses the `range` function to iterate over the rows and columns of the grid.

Inside the nested loops, the code checks the current position (i, j) and prints the appropriate character based on the following conditions:

* If the current position is one of the corners (i.e., (0, 0), (0, H-1), (W-1, 0), or (W-1, H-1)), it prints a "+" character.
* If the current position is on the left or right edge of the grid (i.e., j == 0 or j == W-1), but not on the corners, it prints a "-" character.
* If the current position is on the top or bottom edge of the grid (i.e., i == 0 or i == H-1), but not on the corners, it prints a "|" character.
* If the current position is the center of the grid (i.e., i == y and j == x), it prints the character provided in the input.
* Otherwise, it prints a "." character.

Finally, the code prints a newline character at the end of each row to separate the rows in the output.</s>
