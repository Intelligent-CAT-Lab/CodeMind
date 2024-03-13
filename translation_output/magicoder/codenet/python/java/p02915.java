<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            System.out.println(n * n * n);
        }
    }
}
```

In this Java code, we use a `Scanner` to read from the standard input. The `hasNextLine()` method checks if there is another line to read. If there is, it reads the line and splits it into words using the `split(" ")` method. The first word is converted to an integer using `Integer.parseInt()`. The cube of the number is then printed to the standard output.<｜end▁of▁sentence｜>
