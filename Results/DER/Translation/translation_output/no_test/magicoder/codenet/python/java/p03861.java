<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int result = b / x - (a - 1) / x;

        System.out.println(result);
    }
}
```<｜end▁of▁sentence｜>
