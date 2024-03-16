<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

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
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read the input from the user, and then it uses a nested `for` loop to iterate over the rows and columns of the grid, and print the appropriate values based on the conditions you specified in the Python code.

Note that the Java code uses the `System.out.print()` method to print the values, and the `System.out.println()` method to print a newline character at the end of each row. The `System.out.println()` method is used instead of the `print()` method to ensure that the output is printed on a new line.</s>
