<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```

@@ Response
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
```<｜end▁of▁sentence｜>
