<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Nox

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 2 * N; i++) {
                list.add(i);
            }
            list.remove(x - 1);
            list.remove(x - 1);
            list.remove(x - 1);
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

This Java code does the same thing as the Python code. It reads two integers from the input, checks if `x` is 1 or 2 * `N` - 1, and prints "No" if so. Otherwise, it creates a list of integers from 1 to 2 * `N`, removes the elements at positions `x - 1`, `x`, and `x + 1`, and then prints the remaining elements in the list.
<|EOT|>
