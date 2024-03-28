<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

This Java code does the same thing as the Python code. It reads the input, splits it into width, height, and character, and then prints the desired output. The Java code uses a Scanner to read the input, and the print statements are used to output the desired output.<｜end▁of▁sentence｜>
