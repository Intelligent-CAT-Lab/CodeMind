System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Nox

```
N, x = map ( int, input ( ). split ( ) )
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1, 2 * N ) ]
    l. remove ( x - 1 )
    l. remove ( x )
    l. remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i <= 2 * N; i++) {
                if (i!= x - 1 && i!= x && i!= x + 1) {
                    l.add(i);
                }
            }
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(i));
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = N - 2; i < l.size(); i++) {
                System.out.println(l.get(i));
            }
        }
    }
}
```

Test input:
2 1

Expected output:
No<|endoftext|>
