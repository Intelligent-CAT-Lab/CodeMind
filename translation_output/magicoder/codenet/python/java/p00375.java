<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. Then we perform the same operations as in the Python code: subtract 30 from the input and divide the result by 2. Finally, we print the result.<｜end▁of▁sentence｜>
