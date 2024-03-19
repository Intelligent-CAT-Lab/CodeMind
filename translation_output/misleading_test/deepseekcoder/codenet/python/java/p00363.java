<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        String c = scanner.next();
        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
    }
}
```

This Java code does the same thing as the Python code. It reads three integers and a string from the input, then prints a rectangle of the specified size and character. The rectangle is made up of "+" and "-" characters for the top and bottom edges, and "|" and "." characters for the sides and the character in the middle.
<|EOT|>
