<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;

        System.out.println(sum);
    }
}
```

You can test this code with the following test input:

```
1 3 4
```

And it will output:

```
4
```<｜end▁of▁sentence｜>
