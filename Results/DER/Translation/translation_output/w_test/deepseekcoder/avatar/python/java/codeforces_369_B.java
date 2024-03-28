<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();

        int rem = 0;
        int ones = 0;
        ArrayList<Integer> string = new ArrayList<>();
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add((int)Math.floor((double)arr.get(arr.size() - 1) / arr.get(1)) + (ones > 0 ? 1 : 0));
            ones--;
        }
        if (!arr.get(0).equals(arr.get(1))) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add((int)Math.floor((double)rem / (arr.get(0) - arr.get(1))) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads integers from the standard input, performs some calculations, and then prints the results. The main difference is that Java uses `ArrayList` instead of Python's list, and Java uses `Scanner` to read from the standard input.
<|EOT|>
