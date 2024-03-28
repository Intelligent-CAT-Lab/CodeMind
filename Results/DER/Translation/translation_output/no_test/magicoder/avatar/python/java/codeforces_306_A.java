<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n , m = map ( int , input ( ) . split ( ) )
q = n // m
r = n % m
a = [ q ] * m
for i in range ( r ) :
    a [ i ] += 1
for i in range ( m ) :
    print ( a [ i ] , end = ' â ' )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < r; i++) {
            a[i] += 1;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the user, calculates `q` and `r`, creates an array `a` of size `m`, fills it with `q`, increments the first `r` elements of `a` by 1, and then prints the elements of `a`.<｜end▁of▁sentence｜>
