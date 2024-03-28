<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
++
#B|
!9H

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dimensions = input.split(" ");
        int width = Integer.parseInt(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
        char character = dimensions[2].charAt(0);

        System.out.print("+");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < height - 2; i++) {
            if (i * 2 == height - 3) {
                System.out.print("|");
                for (int j = 0; j < (width - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.print(character);
                for (int j = 0; j < (width - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            } else {
                System.out.println("|" + ".".repeat(width - 2) + "|");
            }
        }

        System.out.print("+");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input string into three parts: the width, height, and character. It then uses a for loop to print the top and bottom lines of the rectangle, and another for loop to print the middle lines. The middle lines are printed differently depending on whether the current line is the middle line or not. If it is the middle line, it prints the character in the middle of the line, otherwise it prints a line of dots. Finally, it prints the bottom line.</s>
