<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> list = new ArrayList<>();
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

This Java code does the same thing as the Python code. It reads two integers N and x from the standard input, and then checks if x is 1 or 2N-1. If it is, it prints "No". Otherwise, it prints "Yes", removes the numbers x-1, x, and x+1 from a list, and then prints the remaining numbers in the list.<｜end▁of▁sentence｜>
