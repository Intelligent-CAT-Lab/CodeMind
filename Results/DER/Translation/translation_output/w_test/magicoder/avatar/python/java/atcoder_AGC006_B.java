<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
No


```
N , x = map ( int , input ( ) . split ( ) )
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1 , 2 * N ) ]
    l . remove ( x - 1 )
    l . remove ( x )
    l . remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 2 * N; i++) {
                list.add(i);
            }
            list.remove(x - 1);
            list.remove(x);
            list.remove(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(i));
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(N - 2 + i));
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if `x` is 1 or 2 * `N` - 1, and prints "No" if it is. Otherwise, it creates an ArrayList of integers from 1 to 2 * `N`, removes `x - 1`, `x`, and `x + 1` from the list, and then prints the remaining elements in the list.<｜end▁of▁sentence｜>
