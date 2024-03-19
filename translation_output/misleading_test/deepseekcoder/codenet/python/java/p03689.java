<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 2 2

Expected output:
Yes
1 1 1
1 -4 1
1 1 1
5

```
H,W,h,w=[int(i) for i in input().split()]

if H%h==0 and W%w==0:
        print("No")
elif W%w!=0:
        print("Yes")
        for y in range(H):
                for x in range(W):
                        if x!=0:
                                print(" ",end="")
                        if (x%w)!=(w-1):
                                print(100000,end="")
                        else:
                                print(-100000*(w-1)-1,end="")
                print()
else:
        print("Yes")
        for y in range(H):
                for x in range(W):
                        if x!=0:
                                print(" ",end="")
                        if (y%h)!=(h-1):
                                print(100000,end="")
                        else:
                                print(-100000*(h-1)-1,end="")
                print()
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        if (H % h == 0 || W % w == 0) {
            System.out.println("No");
        } else if (W % w != 0) {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if (x % w != w - 1) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (w - 1) - 1);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if (y % h != h - 1) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (h - 1) - 1);
                    }
                }
                System.out.println();
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, and then checks if the height and width of the grid are divisible by the height and width of the subgrid. If they are, it prints "No". Otherwise, it prints "Yes" and then prints the grid. The grid is filled with 100000s where the subgrid can be placed, and -100000s where the subgrid cannot be placed.
<|EOT|>
