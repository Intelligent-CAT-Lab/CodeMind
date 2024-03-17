<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1

Expected output:
1 

```
import math
arr = list ( map ( int , input ( ) . split ( ) ) )
rem = 0
ones = 0
string = [ ]
ones = arr [ - 1 ] % arr [ 1 ]
for i in range ( 0 , arr [ 1 ] ) :
    string . append ( math . floor ( arr [ - 1 ] / arr [ 1 ] ) + ( ones > 0 ) )
    ones -= 1
if not arr [ 0 ] == arr [ 1 ] :
    rem = arr [ - 2 ] - arr [ - 1 ] ; ones = rem % ( arr [ 0 ] - arr [ 1 ] )
    for i in range ( arr [ 1 ] , arr [ 0 ] ) :
        string . append ( math . floor ( rem / ( arr [ 0 ] - arr [ 1 ] ) + ( ones > 0 ) ) )
        ones -= 1
for i in string :
    print ( f " { i } â " , end = ' ' )


```
[/INST]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(scanner.nextInt());
        }
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add(Math.floor((double) arr.get(arr.size() - 1) / arr.get(1)) + (ones > 0));
            ones--;
        }
        if (arr.get(0) != arr.get(1)) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add(Math.floor((double) rem / (arr.get(0) - arr.get(1)) + (ones > 0)));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + "  ");
        }
    }
}
```</s>
