<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7


```
x1 , y1 , x2 , y2 = map ( int , input ( ) . split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b , y2 + a , x1 - b , y1 + a )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into an array of strings, where each element is a single number.
* The `parseInt()` method is used to convert each string to an integer.
* The `a` and `b` variables are calculated using the difference between the `x` and `y` coordinates of the two points.
* The `System.out.println()` method is used to print the output.

Note: The `map()` function in Python is not necessary in Java, as the `parseInt()` method can be used to convert the input string to an integer directly.</s>
