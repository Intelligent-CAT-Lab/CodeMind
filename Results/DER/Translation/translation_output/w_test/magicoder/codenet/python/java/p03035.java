<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30 100

Expected output:
100


```
A,B=map(int,input().split())
if A>=13:
  print(B)
elif 6<=A<=12:
  print(B//2)
else:
  print(0)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A >= 13) {
            System.out.println(B);
        } else if (6 <= A && A <= 12) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

You can test this code with the following test input:

```
30 100
```

And it will output:

```
100
```<｜end▁of▁sentence｜>
