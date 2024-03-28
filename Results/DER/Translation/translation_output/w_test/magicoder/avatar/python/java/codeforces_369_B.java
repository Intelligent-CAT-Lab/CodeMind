<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.add((int) Math.floor(arr[arr.length - 1] / arr[1]) + (ones > 0 ? 1 : 0));
            ones--;
        }
        if (!(arr[0] == arr[1])) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add((int) Math.floor(rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an array of integers from the standard input, calculates the remainder and the number of ones, and then fills the list with the calculated values. Finally, it prints the list.<｜end▁of▁sentence｜>
