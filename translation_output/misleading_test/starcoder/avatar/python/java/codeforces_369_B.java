<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = 0;
        int ones = 0;
        ArrayList<Integer> string = new ArrayList<Integer>();
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.add(Math.floorDiv(arr[5], arr[1]) + (ones > 0? 1 : 0));
            ones--;
        }
        if (arr[0]!= arr[1]) {
            rem = arr[5] - arr[4];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add(Math.floorDiv(rem, (arr[0] - arr[1])) + (ones > 0? 1 : 0));
                ones--;
            }
        }
        for (int i = 0; i < string.size(); i++) {
            System.out.print(string.get(i) + " ");
        }
    }
}
```
<|endoftext|>
