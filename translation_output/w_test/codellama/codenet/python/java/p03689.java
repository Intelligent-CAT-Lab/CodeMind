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
This code uses the `Scanner` class to read the input from the user, and then it checks if the input is valid or not. If the input is valid, it prints "Yes" and the required output, otherwise it prints "No".

The output is printed in the format of a matrix, with each element separated by a space. The elements are calculated based on the input values, and the formula for calculating the elements is as follows:

* If the element is not on the rightmost column, the value is 100000.
* If the element is on the rightmost column, the value is -100000 \* (w - 1) - 1, where w is the width of the matrix.

Note that the code assumes that the input is valid, and it does not perform any error handling.</s>
