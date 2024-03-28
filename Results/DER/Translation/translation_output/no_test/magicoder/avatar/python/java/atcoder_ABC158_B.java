<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);

        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads three integers from the user, calculates the number of times A can be added to B without exceeding N, and then adds the minimum of the remaining number of times A can be added to B and the remaining number of times B can be added to A. The result is then printed to the console.<｜end▁of▁sentence｜>
