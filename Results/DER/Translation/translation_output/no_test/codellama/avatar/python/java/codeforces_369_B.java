<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.add(Math.floor(arr[arr.length - 1] / arr[1]) + (ones > 0));
            ones -= 1;
        }
        if (arr[0] != arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add(Math.floor(rem / (arr[0] - arr[1]) + (ones > 0)));
                ones -= 1;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` class to convert the input string into an array of integers. The `Math` class is used for mathematical operations, such as floor and modulus. The `List` interface is used to create a list of integers, and the `ArrayList` class is used to implement the list. The `Collectors` class is used to collect the elements of the list into a string.</s>
