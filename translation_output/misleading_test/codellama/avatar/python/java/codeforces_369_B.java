<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1

Expected output:
-15

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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = Integer.parseInt(arr[arr.length - 1]) % Integer.parseInt(arr[1]);
        for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
            string.add((int) Math.floor(Integer.parseInt(arr[arr.length - 1]) / Integer.parseInt(arr[1])) + (ones > 0 ? 1 : 0));
            ones -= 1;
        }
        if (!arr[0].equals(arr[1])) {
            rem = Integer.parseInt(arr[arr.length - 2]) - Integer.parseInt(arr[arr.length - 1]);
            ones = rem % (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
            for (int i = Integer.parseInt(arr[1]); i < Integer.parseInt(arr[0]); i++) {
                string.add((int) Math.floor(rem / (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1])) + (ones > 0 ? 1 : 0)));
                ones -= 1;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}
```
This code takes input from the user and splits it into an array of strings using the `split()` method. It then converts the strings to integers using the `parseInt()` method and calculates the remainder and the number of ones using the modulo operator `%`.

The code then creates a list of integers called `string` and adds the first `arr[1]` elements of the array to it. It then checks if `arr[0]` is equal to `arr[1]`, if it is not, it calculates the remainder and the number of ones and adds the remaining elements to the list.

Finally, the code prints the elements of the list separated by a space.

Note that the code uses the `Math.floor()` method to round down the result of the division to the nearest integer.</s>
