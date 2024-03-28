<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

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
        StringBuilder string = new StringBuilder();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.append((int)Math.floor((double)arr[arr.length - 1] / arr[1]) + (ones > 0 ? 1 : 0)).append(" ");
            ones--;
        }

        if (!(arr[0] == arr[1])) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.append((int)Math.floor((double)rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0)).append(" ");
                ones--;
            }
        }

        System.out.println(string.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an array of integers from the standard input, calculates the required values and prints the result.
<|EOT|>
