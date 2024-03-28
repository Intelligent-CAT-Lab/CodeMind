<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);
        int w = Integer.parseInt(input[3]);

        if (H % h == 0 && W % w == 0) {
            System.out.println("No");
        } else if (W % w != 0) {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if ((x % w) != (w - 1)) {
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
                    if ((y % h) != (h - 1)) {
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
This code first reads the input from the user, and then checks if the height and width of the grid are divisible by the height and width of the rectangle. If they are, it prints "No" and exits.

If the width is not divisible by the width of the rectangle, it prints "Yes" and then prints the grid with the rectangle filled in. It does this by iterating over the rows and columns of the grid, and printing a space if the current cell is not the first cell in the row, and then printing either 100000 or -100000 * (w - 1) - 1 depending on whether the current cell is the last cell in the row or not.

If the height is not divisible by the height of the rectangle, it prints "Yes" and then prints the grid with the rectangle filled in. It does this by iterating over the rows and columns of the grid, and printing a space if the current cell is not the first cell in the row, and then printing either 100000 or -100000 * (h - 1) - 1 depending on whether the current cell is the last cell in the column or not.</s>
