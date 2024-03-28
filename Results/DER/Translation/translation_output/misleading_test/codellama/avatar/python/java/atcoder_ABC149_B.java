<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-28 999999999909

```
number = input ( )
a , b , k = [ int ( ele ) for ele in number . split ( ' â ' ) ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a , b )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int k = Integer.parseInt(numbers[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            if (b < 0) {
                b = 0;
            }
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

Explanation:

* We first split the input string by the space character to get the three numbers.
* We then convert each number to an integer using `Integer.parseInt()`.
* We calculate the result of `a - k` and store it in a variable called `res`.
* If `res` is less than 0, we set `a` to 0 and add `res` to `b`. We also check if `b` becomes negative after this operation, and if it does, we set it to 0.
* If `res` is greater than or equal to 0, we set `a` to `res`.
* Finally, we print the values of `a` and `b` separated by a space.

Note: The code assumes that the input is a valid string of three integers separated by spaces. If the input is not valid, the code may throw a `NumberFormatException`.</s>
