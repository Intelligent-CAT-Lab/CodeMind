Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                } else if (j!= 0 && j!= W - 1 && i == 0 || j!= 0 && j!= W - 1 && i == H - 1) {
                    System.out.print("-");
                } else if (i!= 0 && i!= H - 1 && j == 0 || i!= 0 && i!= H - 1 && j == W - 1) {
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
                if (j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1):
                    System.out.print("+");
                elif (j!= 0 and j!= W - 1 and i == 0 or j!= 0 and j!= W - 1 and i == H - 1):
                    System.out.print("-");
                elif (i!= 0 and i!= H - 1 and j == 0 or i!= 0 and i!= H - 1 and j == W - 1):
                    System.out.print("|");
                elif (j == x and i == y):
                    System.out.print(c);
                else:
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
