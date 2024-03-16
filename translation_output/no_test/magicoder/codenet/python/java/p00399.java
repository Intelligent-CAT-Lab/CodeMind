<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int g = Integer.parseInt(input[3]);
        System.out.println(r + b + w + g);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, splits it into an array of strings, and then converts each string to an integer. It then adds up all the integers and prints the result.<｜end▁of▁sentence｜>
