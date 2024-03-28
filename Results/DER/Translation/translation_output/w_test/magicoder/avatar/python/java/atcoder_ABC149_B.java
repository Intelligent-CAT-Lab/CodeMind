<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
0 1000000000000


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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);
        long k = Long.parseLong(numbers[2]);
        long res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0 ? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

This Java code does the same thing as the Python code. It reads three space-separated long integers from the standard input, calculates the result, and prints the result. The `split` method is used to split the input string into an array of strings, and `Long.parseLong` is used to convert each string to a long integer. The `if` statement checks if the result is less than 0, and if so, it sets `a` to 0, adds the result to `b`, and then checks if `b` is less than 0 and sets it to 0 if it is. If the result is not less than 0, it simply sets `a` to the result. Finally, it prints the values of `a` and `b` separated by a space.<｜end▁of▁sentence｜>
