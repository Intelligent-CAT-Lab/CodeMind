<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 2 4

Expected output:
2


```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

You can test this code with the following test input:

```
100 2 4
```

And it will output:

```
2
```<｜end▁of▁sentence｜>
