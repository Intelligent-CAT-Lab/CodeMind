Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = 0;
        int ones = 0;
        int[] string = new int[arr[0]];
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string[i] = (int) Math.floor(arr[5] / arr[1]) + (ones > 0? 1 : 0);
            ones--;
        }
        if (arr[0]!= arr[1]) {
            rem = arr[4] - arr[5];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string[i] = (int) Math.floor(rem / (arr[0] - arr[1])) + (ones > 0? 1 : 0);
                ones--;
            }
        }
        for (int i = 0; i < arr[0]; i++) {
            System.out.print(string[i] + " ");
        }
    }
}
```<|endoftext|>
