<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
+-+
|B|
+-+


```
w,h,c=input().split(" ")
w=int(w)
h=int(h)
print("+"+"-"*(w-2)+"+")
for i in range(h-2):
    if i*2==h-3:
        print("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|")
    else:
        print("|"+"."*(w-2)+"|")
print("+"+"-"*(w-2)+"+")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        String c = scanner.next();
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                for (int j = 0; j < (w - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.print(c);
                for (int j = 0; j < (w - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            } else {
                System.out.print("|");
                for (int j = 0; j < w - 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            }
        }
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
```

This Java code does the same thing as the Python code. It reads the width, height, and character from the input, and then prints a grid of the specified size and character. The grid has a plus sign at the top left and bottom right, and vertical and horizontal lines in the middle. The character is printed in the middle of the grid if the height is odd.
<|EOT|>
