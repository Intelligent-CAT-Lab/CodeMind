System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
65


```
A, B, C, D = map ( int, input ( ). split ( ) )
m = 998244353
d = [ [ 0 ] * ( D + 1 ) for _ in range ( C + 1 ) ]
d [ A ] [ B ] = 1
for i in range ( A, C + 1 ) :
    for j in range ( B, D + 1 ) :
        d [ i ] [ j ] += ( d [ i ] [ j - 1 ] * i + d [ i - 1 ] [ j ] * j - d [ i - 1 ] [ j - 1 ] * ( i - 1 ) * ( j - 1 ) ) % m
print ( d [ C ] [ D ] )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int D = Integer.parseInt(input[3]);
        int m = 998244353;
        int[][] d = new int[C+1][D+1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                d[i][j] = (int) (((long) d[i][j-1] * i + (long) d[i-1][j] * j - (long) d[i-1][j-1] * (i-1) * (j-1)) % m);
            }
        }
        System.out.println(d[C][D]);
    }
}
```<|endoftext|>
