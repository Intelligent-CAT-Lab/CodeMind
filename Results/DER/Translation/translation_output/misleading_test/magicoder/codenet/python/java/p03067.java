<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 5

Expected output:
Y>s

```
a,b,c=map(int,input().split())
if a<c<b or a>c>b:
  print('Yes')
else:
  print('No')
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

        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can test this code with the following test input:

```
3 8 5
```

And it will output:

```
Yes
```<｜end▁of▁sentence｜>
