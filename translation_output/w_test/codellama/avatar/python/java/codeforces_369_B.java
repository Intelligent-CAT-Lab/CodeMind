<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
            ones--;
        }
        if (!arr[0].equals(arr[1])) {
            rem = Integer.parseInt(arr[arr.length - 2]) - Integer.parseInt(arr[arr.length - 1]);
            ones = rem % (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
            for (int i = Integer.parseInt(arr[1]); i < Integer.parseInt(arr[0]); i++) {
                string.add((int) Math.floor(rem / (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1])) + (ones > 0 ? 1 : 0)));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}
```
This code takes input from the user and splits it into an array of strings using the `split()` method. It then converts the last element of the array to an integer using `Integer.parseInt()` and calculates the remainder of the division of the last two elements of the array using the modulo operator `%`.

The code then iterates through the array and calculates the number of ones that need to be added to the string using the `ones` variable. It then adds the ones to the string using the `string.add()` method.

Finally, the code prints the string using the `System.out.print()` method.

Note that this code assumes that the input is a valid string and that the array has at least two elements.</s>
