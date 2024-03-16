<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);

        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.print("|");
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

This Java code does the same thing as the Python code. It reads two integers and a character from the user, then prints a rectangle with the given dimensions and character. The character is printed in the middle of the rectangle if the rectangle's height is odd.<｜end▁of▁sentence｜>
