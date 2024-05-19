System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1

Expected output:
-15

```
import math
arr = list ( map ( int, input ( ). split ( ) ) )
rem = 0
ones = 0
string = [ ]
ones = arr [ - 1 ] % arr [ 1 ]
for i in range ( 0, arr [ 1 ] ) :
    string. append ( math. floor ( arr [ - 1 ] / arr [ 1 ] ) + ( ones > 0 ) )
    ones -= 1
if not arr [ 0 ] == arr [ 1 ] :
    rem = arr [ - 2 ] - arr [ - 1 ] ; ones = rem % ( arr [ 0 ] - arr [ 1 ] )
    for i in range ( arr [ 1 ], arr [ 0 ] ) :
        string. append ( math. floor ( rem / ( arr [ 0 ] - arr [ 1 ] ) + ( ones > 0 ) ) )
        ones -= 1
for i in string :
    print ( f " { i } â ", end ='' )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int rem = 0;
        int ones = 0;
        StringBuilder sb = new StringBuilder();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            sb.append(Math.floor(arr[arr.length - 1] / arr[1]) + (ones > 0) + " ");
            ones -= 1;
        }
        if (!arr[0] == arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                sb.append(Math.floor(rem / (arr[0] - arr[1])) + (ones > 0) + " ");
                ones -= 1;
            }
        }
        System.out.println(sb.toString().trim());
    }
}
```

Test input:
1 1 1 1 1 1

Expected output:
-15<|endoftext|>
