<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
-12

```
A , B , C , D = map ( int , input ( ) . split ( ) )
m = 998244353
d = [ [ 0 ] * ( D + 1 ) for _ in range ( C + 1 ) ]
d [ A ] [ B ] = 1
for i in range ( A , C + 1 ) :
    for j in range ( B , D + 1 ) :
        d [ i ] [ j ] += ( d [ i ] [ j - 1 ] * i + d [ i - 1 ] [ j ] * j - d [ i - 1 ] [ j - 1 ] * ( i - 1 ) * ( j - 1 ) ) % m
print ( d [ C ] [ D ] )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        long m = 998244353;
        long[][] d = new long[C+1][D+1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                d[i][j] += (d[i][j-1]*i + d[i-1][j]*j - d[i-1][j-1]*(i-1)*(j-1) ) % m;
            }
        }
        System.out.println(d[C][D]);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, initializes a 2D array `d` with the first two dimensions being the same size as the input integers, and sets `d[A][B]` to 1. Then it fills the rest of the `d` array with the formula provided in the Python code. Finally, it prints the value at `d[C][D]`.
<|EOT|>
