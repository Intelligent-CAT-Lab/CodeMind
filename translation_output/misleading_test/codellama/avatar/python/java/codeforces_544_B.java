<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
pO

```
numbers = list ( map ( int , input ( ) . split ( ) ) )
start = 0
arr = [ ]
count = 0
for i in range ( 0 , numbers [ 0 ] ) :
    string = " "
    next = start
    for j in range ( 0 , numbers [ 0 ] ) :
        if count < numbers [ 1 ] :
            if j == next :
                string += ' L '
                count += 1
                next += 2
                if next >= numbers [ 0 ] :
                    start = 1 if start == 0 else 0
            else :
                string += " S "
        else :
            string += " S "
    arr . append ( string )
if count < numbers [ 1 ] :
    print ( " NO " )
else :
    print ( " YES " )
    for i in arr :
        print ( i )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);
        int start = 0;
        String[] arr = new String[numbers[0]];
        int count = 0;
        for (int i = 0; i < numbers[0]; i++) {
            String string = "";
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = 1 - start;
                        }
                    } else {
                        string += " S ";
                    }
                } else {
                    string += " S ";
                }
            }
            arr[i] = string;
        }
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `map` method to convert the input string to an array of integers. The `toArray` method is used to convert the `List` returned by `map` to an array. The `String` class is used to concatenate strings, and the `System.out.println` method is used to print output to the console.</s>
