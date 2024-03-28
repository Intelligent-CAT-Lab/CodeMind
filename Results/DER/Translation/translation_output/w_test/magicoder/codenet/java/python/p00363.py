<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
+-+
|B|
+-+


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

@@ Response
```python
W, H, c = map(str, input().split())
W, H = int(W), int(H)
x, y = (W - 1) // 2, (H - 1) // 2

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

This Python code does the same thing as the Java code. It reads the input, calculates the center coordinates, and then prints the desired output. The `end=""` argument in the `print` function is used to prevent a newline after each print.<｜end▁of▁sentence｜>
