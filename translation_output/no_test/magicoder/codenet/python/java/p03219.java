<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int ab = Integer.parseInt(input[0]);
        int bc = Integer.parseInt(input[1]);

        int fare = ab + (bc / 2);

        System.out.println(fare);
    }
}
```<｜end▁of▁sentence｜>
