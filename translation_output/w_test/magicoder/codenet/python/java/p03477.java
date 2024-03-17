<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
Left


```
A,B,C,D=map(int,input().split())
if A+B<C+D:
  print("Right")
elif A+B==C+D:
  print("Balanced")
else:
  print("Left")
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
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```

You can test this code with the following test input:

```
3 8 7 1
```

And it will output:

```
Left
```<｜end▁of▁sentence｜>
