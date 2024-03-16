<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a==b:
    print(c)
elif b==c:
    print(a)
else:
    print(b)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, and then prints the value of the third integer if the first two are equal, the first integer if the second and third are equal, and the second integer otherwise.<｜end▁of▁sentence｜>
