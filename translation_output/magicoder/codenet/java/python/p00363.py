<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    W, H = map(int, input().split())
    c = input()
    x = (W - 1) // 2
    y = (H - 1) // 2

    for i in range(H):
        for j in range(W):
            if (j == 0 and i == 0) or (j == 0 and i == H - 1) or (j == W - 1 and i == 0) or (j == W - 1 and i == H - 1):
                sys.stdout.write("+")
            elif (j != 0 and j != W - 1 and i == 0) or (j != 0 and j != W - 1 and i == H - 1):
                sys.stdout.write("-")
            elif (i != 0 and i != H - 1 and j == 0) or (i != 0 and i != H - 1 and j == W - 1):
                sys.stdout.write("|")
            elif (j == x and i == y):
                sys.stdout.write(c)
            else:
                sys.stdout.write(".")
        print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the width, height, and character from the user, and then prints a box with the character in the center. The box is surrounded by plus signs, minus signs, and vertical bars. The character is printed in the center of the box.<｜end▁of▁sentence｜>
