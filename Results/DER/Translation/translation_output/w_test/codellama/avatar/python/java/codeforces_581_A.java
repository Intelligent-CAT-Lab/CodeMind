<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
45 99

Expected output:
45 27


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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int min = Math.min(a, b);
        int diff = Math.abs(a - b);
        if (diff >= 2) {
            System.out.println(min + " â " + diff / 2);
        } else {
            System.out.println(min + " â 0");
        }
    }
}
```
Note: The `â` symbol in the output is a non-breaking space, which is used to separate the two numbers in the output.</s>
