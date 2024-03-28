<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1199

Expected output:
ABC


```
n = int(input())
if(n < 1200):
    print("ABC")
elif(n < 2800):
    print("ARC")
else:
    print("AGC")
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1200){
            System.out.println("ABC");
        } else if(n < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then prints "ABC" if the integer is less than 1200, "ARC" if it's less than 2800, and "AGC" otherwise.<｜end▁of▁sentence｜>
