<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[2 * N];
            for (int i = 1; i <= 2 * N; i++) {
                l[i] = i;
            }
            l[x - 1] = 0;
            l[x] = 0;
            l[x + 1] = 0;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `int[] l` array is used to store the values of the array, and the `for` loops are used to iterate over the array and print the values.</s>
