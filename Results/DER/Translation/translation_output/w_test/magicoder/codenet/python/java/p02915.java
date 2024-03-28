<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n * n * n);
    }
}
```

This Java code reads an integer from the standard input (console), calculates the cube of the number and prints the result.

You can test this code with the following test input:

```
2
```

And the expected output should be:

```
8
```<｜end▁of▁sentence｜>
