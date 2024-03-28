<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int min = Math.min(A, B);
        int max = Math.max(A + B - N, 0);

        System.out.println(min + " " + max);
    }
}
```

This Java code reads three integers from the standard input (console), calculates the minimum and maximum values as per the Python code, and then prints them.

You can test this code with the provided test input (10 3 5) and it should output the expected result (3 0).<｜end▁of▁sentence｜>
