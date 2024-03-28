<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
    }
}
```

Explanation:

* The `import` statements are used to import the `Scanner` class and the `Math` class from the `java.util` and `java.lang` packages, respectively.
* The `Scanner` class is used to read input from the user.
* The `Math` class is used to perform mathematical operations, including the `ceil` method, which rounds a number up to the nearest integer.
* The `main` method is the entry point of the program, and it takes an array of strings as an argument.
* The `Scanner` object is created to read input from the user.
* The `h` and `a` variables are declared and initialized with the values read from the user input.
* The `Math.ceil` method is used to round the result of the division of `h` by `a` up to the nearest integer.
* The result is printed to the console using the `System.out.println` method.</s>
