<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);

        System.out.print("+" + "-".repeat(w - 2) + "+\n");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.print("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|\n");
            } else {
                System.out.print("|" + ".".repeat(w - 2) + "|\n");
            }
        }
        System.out.print("+" + "-".repeat(w - 2) + "+\n");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers and a character from the input, then prints a rectangle of the specified size with the specified character in the middle of the line. The rectangle is surrounded by plus signs and dashes.
<|EOT|>
