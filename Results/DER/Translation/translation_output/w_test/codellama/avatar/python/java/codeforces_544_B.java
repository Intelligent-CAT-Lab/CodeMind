<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
NO


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
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int start = 0;
        int count = 0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String string = "";
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next += 2;
                        if (next >= n) {
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
        if (count < k) {
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
Note: The code is written in Java 8, and it uses the `Scanner` class to read the input from the user. The `String` class is used to manipulate the strings. The `int` data type is used for the variables that hold the input values. The `if-else` statements are used to check the conditions and print the output accordingly.</s>
