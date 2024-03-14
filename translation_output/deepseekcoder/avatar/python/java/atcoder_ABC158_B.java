<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )


```

### Response:
Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads three integers from the input, calculates the number of times A can fit into N, adds the remaining part to the result if it's less than A, and then prints the result.
<|EOT|>
