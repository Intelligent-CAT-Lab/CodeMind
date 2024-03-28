<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
7


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

You can test this code with the following test input:

```
5 7 5
```

And it will output:

```
7
```<｜end▁of▁sentence｜>
