<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = list ( input ( ) . split ( ) )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
a = x [ 0 ]
b = x [ 1 ]
print ( min ( x ) , end = " â " )
if abs ( a - b ) >= 2 :
    print ( abs ( a - b ) // 2 )
else :
    print ( 0 )


```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] x = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        int a = x[0];
        int b = x[1];
        Arrays.sort(x);
        System.out.print(x[0] + " â ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then sorts the array and prints the smallest integer and the difference between the smallest and largest integers divided by 2, or 0 if the difference is less than 2.
<|EOT|>
