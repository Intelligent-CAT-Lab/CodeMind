<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
L, R = map(int,(input().split()))
print(L*R)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        System.out.println(L * R);
    }
}
```<｜end▁of▁sentence｜>
